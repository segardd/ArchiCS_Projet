package rmi.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.server.UnicastRemoteObject; 
import java.rmi.server.*;

public class Server extends ImplExample { 
   public Server() {} 
   public static void main(String args[]) { 
        System.setProperty("java.rmi.server.hostname", "localhost");
          try {
            
            Server obj = new Server();
            RMITest stub = (RMITest) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("rmi://localhost/Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
   } 
} 
