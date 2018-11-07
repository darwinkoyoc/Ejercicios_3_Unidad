package PilasyColas;

/**
 *
 * @author Darwin Arath
 */
public class Cola {
    
    protected Nodo inicio;
    protected Nodo fin;
    
    public Cola()
    {
        inicio = fin = null;
    }
    
    public boolean colaVacia()
    {
        if(inicio==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
    
    public void insertar(String elemento)
    {
        Nodo dato;
        dato = new Nodo(elemento);
        if (colaVacia()) 
        {
            inicio = dato;
        } else {
            fin.siguiente = dato;
        }
            fin = dato;
    }
    
    public String imprimir()
    {
        String aux;
        if (!colaVacia())
        {
            aux = inicio.elemento;
            inicio = inicio.siguiente;
        } else {
            return "";
        }
            return aux;
    }
    
}
