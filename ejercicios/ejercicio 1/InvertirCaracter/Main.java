
package InvertirCaracter;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Pilas p=new Pilas();
        Scanner dato= new Scanner(System.in);
        String letra;
        
        System.out.print("Ingresa la palabra: ");
        letra=dato.nextLine();
        p.InvertirPalabra(letra);
        p.Imprimir();
        
        
    }
    
}
