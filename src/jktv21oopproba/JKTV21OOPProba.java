/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class JKTV21OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname(" Lev");
        author1.setLastname(" Tolstoi");
        
        
        Book book = new Book();
        book.setTitle(" Voina i mir");
        book.addAuthor(author1);
        System.out.println(book.toString());
        
        
        
        
    
     Author author3 = new Author();
     author3.setFirstname(" Ilja");
     author3.setLastname(" Ilf");
     Author author4 = new Author();
     author4.setFirstname(" Evgeni");
     author4.setLastname(" Petrov");
     
     
     Book book1 = new Book();
     book1.setTitle(" 13 Stuljev");
     book1.addAuthor(author3);
     book1.addAuthor(author4);
     System.out.println(book1.toString());
        
        
       
    }
    
}
