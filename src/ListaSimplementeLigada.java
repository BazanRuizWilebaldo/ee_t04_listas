/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WILY
 */
public abstract class ListaSimplementeLigada<T> implements IListas<T> {

    public ListaSimplementeLigada() {
        inicio = null;
    }

    
    private Nodo<T> inicio;
    public Nodo<T> getInicio() {
        return inicio;
    }
    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    
    
    

    public void inserta_inicio(T dato) {
        Nodo<T> aux = new Nodo<T>(dato);
        aux.setSiguiente(inicio);
        inicio = aux;

    }

    public void recorer_r() {
        Nodo<T> aux = inicio;

        while (inicio != null) {
            System.out.println(inicio.getDato());
            aux = aux.getSiguiente();
        }
    }

    public void inserta_final(T dato) {

        Nodo<T> al = new Nodo<>(dato);
        Nodo<T> aux = inicio;

        if (inicio == null) {
            inicio = al;
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(al);

        }

    }

    public void inserta_antes_de(T dato, T referencia) {
        if (inicio == null) {
            System.out.println("la lista se encuentra vacia");
        }

        Nodo<T> actual = inicio;
        Nodo<T> anterior = null;

        boolean bandera = false;
        while (!actual.getDato().equals(referencia) && !bandera) {
            if (actual.getSiguiente() != null) {
                anterior = actual;
                actual = actual.getSiguiente();

            } else {
                bandera = true;

            }

        }
        if (!bandera) {
            Nodo<T> no = new Nodo<>(dato);
            if (actual == inicio) {
                no.setSiguiente(no);
                inicio = no;

            } else {
                anterior.setSiguiente(no);
                no.setSiguiente(actual);

            }

        } else {
            System.out.println("el nodo que se encuntra como referencia no se encuentra ");

        }
    }

    public void inserta_despues_de(T dato, T referencia) {

        if (inicio == null) {

            System.out.println("la lista se  encuentra vacia");

        }

        Nodo<T> actual = inicio;
        boolean Existe = false;
        while (!actual.getDato().equals(referencia) && !Existe) {
            if (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();

            } else {
                Existe = true;

            }
        }
        if (!Existe) {
            Nodo<T> no = new Nodo<>(dato);
            no.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(no);
        } else {
            System.out.println("el nodo que tenemos como referencia no esta");
        }

    }

    public T elimina_primero() {
        if (inicio != null) {
            inicio = inicio.getSiguiente();
        }
    }

    public T elimina_ultimo() {
        Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        if (inicio.getSiguiente() == null) {
            inicio = null;

        } else {
            while (aux.getSiguiente() != null) {
                anterior = aux;
                aux = aux.getSiguiente();

            }
            anterior.setSiguiente(null);
        }

    }

}
