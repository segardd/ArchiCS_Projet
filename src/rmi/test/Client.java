package rmi.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.rmi.*;
// COMMANDE QUI LANCE LE SERVEUR
//A UTILISER DANS LE FICHIER build/classes DU PROJET
//"D:\Program Files\Java\jdk-11.0.2\bin\rmiregistry" -J-Djava.rmi.server.useCodebaseOnly=false
public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
		String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            RMITest stub = (RMITest) registry.lookup("rmi://localhost/Hello");
            stub.printMsg();
            //System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
   }
}
