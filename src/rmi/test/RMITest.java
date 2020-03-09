/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.test;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author donat
 */
public interface RMITest extends Remote {

    
     
        void printMsg() throws RemoteException;  

    
}
