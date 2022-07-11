using MongoDB.Bson.Serialization.Attributes;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Text;

namespace MongoDBCsharp.Models
{
  public  class Teacher : Person
    {
        [BsonElement("titulo")]
        public string titulo { get; set; }

        public Teacher(string id, string name, int age, string country,string titulo) 
            : base (id, name, age, country)
        {
            this.titulo = titulo;
        }

        public override string ToString()
        {
            return "Teacher{" + "name=" + name + ", age=" + age + ", country=" + country + '}';
        }

        public override bool create(string table, Object record)
        {
            
            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Teacher>(table);
                peopleDB.InsertOne((Teacher)record);
                return true;
            }
            catch(MongoClientException e)
            {
                return false;
            }

        }

        public override bool delete(string table, string id)
        {
            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Teacher>(table);
                peopleDB.DeleteOne(d => d.id == id);
                return true;
            }
            catch (MongoClientException e)
            {
                return false;
            }
        }

        public override void read(string table)
        {
            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Teacher>(table);
                List<Teacher> list = peopleDB.Find(d => true).ToList();
                
                foreach(Teacher item in list)
                {
                   Console.Write( item.ToString());
                }
            }
            catch (MongoClientException e)
            {
                
            }
        }

        public override void read(string table, string criterio)
        {
            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Teacher>(table);
                List<Teacher> list = peopleDB.Find(d => true).ToList();

                foreach (Teacher item in list)
                {
                    if (criterio == item.name)
                    {
                        Console.Write(item.ToString());
                    }
                }
            }
            catch (MongoClientException e)
            {

            }
        }

        public override bool update(string table, string id, object newRecord)
        {
            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Teacher>(table);
                peopleDB.ReplaceOne(d => d.id == id, (Teacher)newRecord);
                return true;
            }
            catch (MongoClientException e)
            {
                return false;
            }
        }
    }
}
