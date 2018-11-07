/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapps;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 92019562
 */
public class Product extends Observable{
 
    // set some backing fields
    private ArrayList<Observer> observers;
    private String productName;
    private int qtyInStock;
    
    // ctor
    public Product(String prodName) {
            super();
            productName = prodName;
            // set some defaults
            qtyInStock = 0;
            observers = new ArrayList<Observer>(){};
    }
 
    public void setQty(int newQty) {
        qtyInStock = newQty;
 
        if(qtyInStock > 0)
        {
            setChanged();
            notifyObservers(this, productName);
        }
    }
 
    public void notifyObservers(Observable observable,String prodName) {
            System.out.println("Notification to all subscribers when a Product becomes available:");
             for (Observer ob : observers) {
                 ob.update(observable, prodName);
             }
    }
 
    public void registerObserver(Observer observer) {
             observers.add(observer);
    }
 
    public void removeObserver(Observer observer) {
             observers.remove(observer);
    }
}
