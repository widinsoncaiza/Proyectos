/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pooExam.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.pooExam.model.Books;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;
import  org.json.simple.JSONArray ;
import  org.json.simple.JSONObject ;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Simulator {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int selection;
        System.out.println("Welcom");
        System.out.println("Select the options");
        selection=sc.nextInt();
        if(selection==1){
            writeJSON();
            }else{
                if(selection==2){
                    readJSON();
        }
            }
    
    }
    
    public static void writeJSON() throws IOException, Exception{
        
        String title;
        String author;
        String publisher;
        int yearPublisher;
        ArrayList<Books> book = new ArrayList<Books>();
        Books booksArray[] = new Books[10];
        Scanner sc = new Scanner(System.in);
                   
                            
        System.out.println("Ingrese el titulo del libro:");
        title=sc.nextLine();
        System.out.println("Ingrese el author :");
        author=sc.nextLine();
        System.out.println("Ingrese el publisher:");
        publisher=sc.nextLine();
        System.out.println("Ingrese el yearPublisher :");
        yearPublisher=sc.nextInt();
        
        Books books = new Books();
        System.out.println("Blender object -> " + books);
        
        books = new Books( title, author,  publisher, yearPublisher);
        System.out.println("Book object -> " + books);
                   
        book.add(books);
               
        System.out.println("Books -> " + books  + "\n");
        booksArray[0] = books;
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBlender;
        jsonBlender = gson.toJson(book);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Book.json")) {
                 writer.write(gson.toJson(books));
             }
    }
    public static void readJSON() throws Exception , ParseException {
        
       
    }
    }

