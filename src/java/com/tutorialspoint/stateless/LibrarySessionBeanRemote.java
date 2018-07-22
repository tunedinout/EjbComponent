/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import javax.ejb.Remote;
import java.util.List;

/**
 *
 * @author narottamkrjha
 */
@Remote
public interface LibrarySessionBeanRemote {
    
    void addBook(String bookName);
    List getBooks();
    
}
