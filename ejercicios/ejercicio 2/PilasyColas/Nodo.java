package PilasyColas;

class Nodo {
    
    String elemento;//valor
    Nodo siguiente; //sigiente
    boolean getelemento;
 
    public Nodo(String x)
    {
        elemento = x;
        siguiente = null;
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo ssiguiente;
    

    //Constructor que inicializamos el valor de las variables.
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   

    void setValor(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public void Nodo(String x){
        this.elemento = x;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    public String getelemento() {
        return elemento;
    }

    public void setelemento(String valor) {
        this.elemento = valor;
    }


    void setelemento(char cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getelemento(char cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
