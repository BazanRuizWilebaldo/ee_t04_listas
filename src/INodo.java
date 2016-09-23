/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILY
 */
public interface INodo<T>{
    
    public T getDato();
    public void setDato();
    public INodo<T>getSiguiente();
    public void setSiguiente();
    public String toString();
            
    
}
