package calculatorrmi;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import java.util.Scanner;

/**
 *
 * @author ronny
 */
public class Client {
    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{
        Scanner sc = new Scanner(System.in);
        
        
        
        try {
            CalculatorInterface c = (CalculatorInterface)Naming.lookup("rmi://localhost:1099/Calculator");
            System.out.println("Client is connected to server");
            System.out.println("Seleccione una operacion :\n" 
                    +"1. Suma\n"
                    +"2. Resta\n"
                    +"3. Multiplicacion\n"
                    +"4. Division");
            int choice = sc.nextInt();
            String operation = null; 
            
            int x,y;
            System.out.println("Enter x:");
            x=sc.nextInt();
            System.out.println("Enter y:");
            y=sc.nextInt();
            
            if(choice == 1) operation = "sum";
            if(choice == 2) operation = "substraction";
            if(choice == 3) operation = "multiplication";
            if(choice == 4) operation = "division";

            System.out.println(c.calculate(x, y, operation));
            
        } catch (Exception e) {
        }
        
    }
}
