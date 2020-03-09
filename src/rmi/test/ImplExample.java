/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.test;

/**
 *
 * @author donat
 */
public class ImplExample implements RMITest {  
   
   // Implementing the interface method 
   @Override
   public void printMsg() {  
      System.out.println("This is an example RMI program");  
   }  
}
