package controlador;

import java.util.ArrayList;
import java.util.Comparator;
import modelo.Coche;

/**
 * Clase que se basa en una lista de coches
 *
 * @author alumno
 */
public class ListaCoches extends ArrayList<Coche> {

    private int actual;

    public ListaCoches() {
        super();
        this.actual = 0;
    }

    public boolean esVacia() {
        return isEmpty();
    }

    public void avanzar() {
        actual++;
    }

    public void retroceder() {
        actual--;
    }

    public void irAlprimero() {
        actual = 0;
    }

    public void irAlUltimo() {
        this.actual = size() - 1;
    }

    public boolean esPrimero() {
        if (actual == 0) {
            return true;
        }
        return false;
    }

    public boolean esUltimo() {
        if (actual == size() - 1) {
            return true;
        }
        return false;
    }

    public void añadirCoche(Coche c) {
        add(c);
        System.out.println("Coche añadido");
    }

    public void borrarCoche() {
        remove(actual);

        //en caso de que borraramos el ultimo el indice quedaria fuera de la 
        //lista, para que esto no ocurra lo evitamos con Math.max que lo pondria a 0 
        // en ese caso, si no simplemente lo pondria en el objeto anterior.
        if (actual >= size()) {
            actual = Math.max(0, size() - 1);
        }
    }

    public Coche obtenerCocheActual() {
        return get(actual);
    }
    
    public void ordenarPorMatricula(){
        sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                return c1.getMatricula().compareTo(c2.getMatricula());
            }
        });
    }

}


