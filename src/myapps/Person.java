/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapps;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 92019562
 */
public class Person implements Observer{
    
    // set a backing field
    private String personName;	
 
    // ctor
    public Person(String newName) {
            personName = newName;
    }
 
    // mandatory method because implements Observer
    public void update(Observable mySubject, Object prodName) {
            System.out.println("Hello "+ personName +", the " + (String) prodName + " is now in stock.");
    }
}
