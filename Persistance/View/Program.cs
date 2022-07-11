using Controller.Utils;
using Model;
using System;
using System.Collections;
using System.Collections.Generic;

namespace View
{
    class Program
    {
        static void Main(string[] args)
        {
           
            String fileName = @"C:\Users\Gdavidce\source\repos\Persistance\Json\Contacts.json";

          
            ArrayList usuarios;
            usuarios = new ArrayList();

            for (int i = 0; i < 150; i++)
            {
                UserData usuer = new UserData();
                int entero = i % 13;
                usuer.name="Beatriz: " + entero;
                usuer.amount="Amount " + i;
                usuer.active = false;
                
                usuarios.Add(usuer);
            }

            JsonManager jsonManager;
            jsonManager = new JsonManager(fileName);
            // jsonManager.write2(fileName,usuarios);
            jsonManager.read(fileName);

        }
    }
}
