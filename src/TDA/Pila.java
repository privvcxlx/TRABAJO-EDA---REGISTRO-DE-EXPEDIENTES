package TDA;

public class Pila<T> {
    private NodoPila<T> cima;

    public Pila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(T dato) {
        NodoPila<T> nuevo = new NodoPila<>(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public T desapilar() {
        if (estaVacia()) {
            return null;
        }
        T dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    public T verCima() {
        if (estaVacia()){
        return null;
        }else{
        return cima.getDato();
        }
    }

    public void mostrarPila() {
        NodoPila<T> actual = cima;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
