using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Model
{
   public class UserData
    {
        public string name { get; set; }
        public string amount { get; set; }
        public string lastName{ get; set; }
        public bool active { get; set; }

        public UserData(string name, string amount, string lastName, bool active)
        {
            this.name = name;
            this.amount = amount;
            this.lastName = lastName;
            this.active = active;
        }

        public UserData()
        {

        }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}
