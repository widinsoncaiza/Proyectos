using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using System;
using System.Collections.Generic;
using System.Text;

namespace MongoDBCsharp.Models
{
  public abstract  class Person
    {
        [BsonElement("id")]
        public string id { get; set; }

        [BsonElement("name")]
        public string name { get; set; }

        [BsonElement("age")]
        public int age { get; set; }


        [BsonElement("country")]
        public string country { get; set; }

        public Person(string id, string name, int age, string country)
        {
            this.id = id;
            this.name = name;
            this.age = age;
            this.country = country;
        }

     

        public override string ToString()
        {
            return base.ToString();
        }

        public abstract bool create(string table, Object record);
        public abstract void read(string table);
        public abstract bool delete(string table, string id);
        public abstract void read(string table, string criterio);
        public abstract bool update(string table, string criterio, Object newRecord);

    }
}
