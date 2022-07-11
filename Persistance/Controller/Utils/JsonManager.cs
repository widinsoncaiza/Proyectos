using Newtonsoft.Json;
using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Controller.Utils
{
    public class JsonManager : FileManager
    {
        public JsonManager(string fileName) : base(fileName)
        {
        }

        public override bool delete(string fileName, string id)
        {
            throw new NotImplementedException();
        }

        public override void find(string fileName, string criterio)
        {
            string collection;
            using (var reader = new StreamReader(fileName))
            {
                collection = reader.ReadToEnd();
            }
            var list = collection;
            var classList = JsonConvert.DeserializeObject<ArrayList>(collection);

            foreach (object item in classList)
            {
                if (criterio == item)
                {
                    Console.Write(item.ToString());
                }
            }
            Console.WriteLine(list);
        }

        public override void read(string fileName)
        {
            string collection;
            using (var reader = new StreamReader(fileName))
            {
                collection = reader.ReadToEnd();
            }
            var list = collection;
            Console.WriteLine(list);
        }

        public override bool update(string fileName, string criterio, object newRecord)
        {
            throw new NotImplementedException();
        }

        public override bool write(string fileName, ArrayList record)
        {
            var collection = JsonConvert.SerializeObject(record.ToArray(), Formatting.Indented);
            File.WriteAllText(fileName, collection);
            return false;
        }

        public bool write2(string fileName, ArrayList record)
        {

            var collection = JsonConvert.SerializeObject(record.ToArray(), Formatting.Indented);
            File.WriteAllText(fileName, collection);
            return false;
        }
    }
}
