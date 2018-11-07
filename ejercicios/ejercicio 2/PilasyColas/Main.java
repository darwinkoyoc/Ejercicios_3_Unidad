package PilasyColas;

import java.util.Scanner;
/**
 *
 * @author Darwin Arath
 */
public class Main {
    
    public static void main(String [] args){
    Pila p= new Pila(); 
    Cola c=new Cola();
    Scanner datos= new Scanner(System.in);
    
    String x;
    
        System.out.print("Ingresa el dato: ");
        x = datos.nextLine();
        
        System.out.print("La pila es: ");
        
        System.out.println();
        System.out.print("La Cola es: ");
        c.insertar(x);
        System.out.println(c.imprimir());
       
        
    
        
    }
    
}
