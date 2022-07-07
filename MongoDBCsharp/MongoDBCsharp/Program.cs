using MongoDB.Driver;
using MongoDBCsharp.Models;
using System;
using System.Collections.Generic;

namespace MongoDBCsharp
{
    class Program
    {
        static void Main(string[] args)
        {
            var client = new MongoClient("mongodb://localhost:27017");
            var database = client.GetDatabase("school");

            var peopleDB = database.GetCollection<People>("people");

            var people = new People() {country ="Ecuador", name = "Genaro Borracho", age = 20 };
            peopleDB.InsertOne(people);
            //List<People> list = peopleDB.Find(d => true).ToList();
            // peopleDB.ReplaceOne(d => d.id == "62c217cd386d4ee5199306a6", people);
           // peopleDB.DeleteOne(d => d.id == "62c217cd386d4ee5199306a6");

        }
    }
}
