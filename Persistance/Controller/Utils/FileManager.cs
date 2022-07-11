using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Controller.Utils
{
   public abstract class FileManager : Persistance
    {
        public string fileName { get; set; }

        public FileManager(string fileName) :
      base()
        {
            this.fileName = fileName;
        }

        public abstract bool write(string fileName, ArrayList record);
        public abstract void read(string fileName);
        public abstract bool delete(string fileName, string id);
        public abstract void find(string fileName, string criterio);
        public abstract bool update(string fileName, string criterio, Object newRecord);

    }

  


}
