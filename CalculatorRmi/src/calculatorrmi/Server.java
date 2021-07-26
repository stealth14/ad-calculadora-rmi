/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
/**
 *
 * @author ronny
 */
public class Server {
    public static void main(String[] args) throws RemoteException,NotBoundException{

        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculator", new CalculatorRmi());
            System.out.println("Server running");
        
    }
}
