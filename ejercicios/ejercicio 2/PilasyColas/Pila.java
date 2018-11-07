package PilasyColas;


public class Pila {
    
     String siguente;
    Nodo inicio;
    int tamanio;
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void Insertar(char cadena){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(cadena);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    
    public void InvertirCadena(String cadena){
        char letra[]= cadena.toCharArray();
        int i;
        for(i=0; i<letra.length; i++){
            Insertar(letra[i]);
        }
           
        
    }
    public void Imprimir(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.print((char)aux.getValor());
            aux = aux.getSiguiente();
            
        }System.out.println();
        } 

    
}
    
    
   
            
           
            
        
        