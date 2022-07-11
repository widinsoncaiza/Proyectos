/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pooExam.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Books {
    private String title;
    private String author;
    private String publisher;
    private int yearPublisher;
    
    public Books(){
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.yearPublisher = 0;
    }

    public Books(String title, String author, String publisher, int yearPublisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublisher = yearPublisher;
    }

         @Override
    public String toString() {
        return "Books{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearPublisher=" + yearPublisher + '}';
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the yearPublisher
     */
    public int getYearPublisher() {
        return yearPublisher;
    }

    /**
     * @param yearPublisher the yearPublisher to set
     */
    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }
    
}
