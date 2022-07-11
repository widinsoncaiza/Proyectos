using MongoDB.Bson.Serialization.Attributes;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Text;

namespace MongoDBCsharp.Models
{
    public class Student : Person
    {
        [BsonElement("grado")]
        public string course { get; set; }


        public Student(string id, string name, int age, string country, string grado)
                    : base(id, name, age, country)
        {
            this.course = grado;
        }

        public override string ToString()
        {
            return "Student{" + "name=" + name + ", age=" + age + ", country=" + country + '}';
        }

        public override bool create(string table, Object record)
        {

            try
            {
                var client = new MongoClient("mongodb://localhost:27017");
                var database = client.GetDatabase("school");

                var peopleDB = database.GetCollection<Student>(table);
                peopleDB.InsertOne((Student)record);
                return true;
            }
            catch (MongoClientException e)
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

                var peopleDB = database.GetCollection<Student>(table);
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

                var peopleDB = database.GetCollection<Student>(table);
                List<Student> list = peopleDB.Find(d => true).ToList();

                foreach (Student item in list)
                {
                    Console.Write(item.ToString());
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

                var peopleDB = database.GetCollection<Student>(table);
                List<Student> list = peopleDB.Find(d => true).ToList();

                foreach (Student item in list)
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

                var peopleDB = database.GetCollection<Student>(table);
                peopleDB.ReplaceOne(d => d.id == id, (Student)newRecord);
                return true;
            }
            catch (MongoClientException e)
            {
                return false;
            }
        }
    }
}
