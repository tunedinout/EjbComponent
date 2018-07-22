/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author narottamkrjha
 */
@Stateless
@Remote
public class LibrarySessionBean implements LibrarySessionBeanRemote {

    List<String> bookShelf;
    
    public LibrarySessionBean(){
        bookShelf = new ArrayList<String>();
        
    }
    @Override
    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    @Override
    public List getBooks() {
        return bookShelf;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
