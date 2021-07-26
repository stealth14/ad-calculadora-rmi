/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ronny
 */
public interface CalculatorInterface extends Remote {
    public String calculate(int x, int y,  String operation)throws RemoteException;
}
