/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ronny
 */
public class CalculatorRmi extends UnicastRemoteObject implements CalculatorInterface{
    public CalculatorRmi() throws RemoteException 
    {
        int a,b;
    }
    
    public String calculate(int a , int b, String operation)throws RemoteException
    {
        int result;
        switch(operation){
            case "sum":
                result = a + b;
                break;
            case "substraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / b;
                break;
            default:
                return "operation not supported";
        }
        return "result: "+result;
    }
    
}
