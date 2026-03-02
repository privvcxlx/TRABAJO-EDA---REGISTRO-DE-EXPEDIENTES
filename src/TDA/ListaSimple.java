package TDA;

public class ListaSimple<T> {
    private NodoSimple<T> primero;
    
    public NodoSimple<T> getPrimero() {
        return primero;
    }

    public ListaSimple() {
        primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertarAlFinal(T dato) {
        NodoSimple<T> nuevo = new NodoSimple<>(dato);
        if (estaVacia()) {
            primero = nuevo;
        } else {
            NodoSimple<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void mostrar() {
        NodoSimple<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
    

    public java.util.List<T> toList() {
        java.util.List<T> lista = new java.util.ArrayList<>();
        NodoSimple<T> actual = primero;
        while (actual != null) {
            lista.add(actual.getDato());
            actual = actual.getSiguiente();
        }
        return lista;
    }



    
}
