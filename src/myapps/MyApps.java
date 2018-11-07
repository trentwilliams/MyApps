/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapps;

/**
 *
 * @author 92019562
 */
public class MyApps {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    CarsTest();
    
  }

  private static void CarsTest() {
    
           Person personManu = new Person("Manu");
        Person personTama = new Person("Tama");
        
        Product productUte = new Product("4x4Ute");
        
        // register the observers 
        productUte.registerObserver(personManu);
        productUte.registerObserver(personTama);
        
        //calling setQty > 0 should issue notification.
        productUte.setQty(10);
    
    
  }
  
}
