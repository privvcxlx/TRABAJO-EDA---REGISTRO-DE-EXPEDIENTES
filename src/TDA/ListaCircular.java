package TDA;

public class ListaCircular<T> {
    private NodoCircular<T> ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public void insertar(T dato) {
        NodoCircular<T> nuevo = new NodoCircular<>(dato);
        if (estaVacia()) {
            nuevo.setSiguiente(nuevo);
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void mostrar() {
        if (!estaVacia()) {
            NodoCircular<T> actual = ultimo.getSiguiente();
            do {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            } while (actual != ultimo.getSiguiente());
        }
    }
}
