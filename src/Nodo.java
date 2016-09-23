/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILY
 */

public class Nodo<T> {

     
    /**
     * Este es el constructor que inicializa el dato en un valor específico
     * @param dato es el dato a inicializar
     */
    public Nodo(T dato){
        this.dato = dato;
        siguiente = null;
    }
     
    /**
     * Este es el dato que va a contener el nodo
     */
    private T dato;
     
    /**
     * Esta es la liga al siguiente nodo
     */
    private Nodo<T> siguiente;
     
    /**
     * Este es el get de la propiedad dato
     * @return El dato
     */
    public T getDato() {
        return dato;
    }
 
    /**
     * Este el el setter de la propiedad dato
     * @param dato es el valor del nodo
     */
    public void setDato(T dato) {
        this.dato = dato;
    }
 
    /**
     * Este es el get de la liga
     * @return un dato de tipo nodo
     */
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
 
    /**
     * Este es el set de la liga
     * @param siguiente es la liga
     */
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
 
    /**
     * Este metodo sobreescribe el toString de la clase Object
     */
    @Override
    public String toString(){
        return "["+dato+"]";
    }
 
}
