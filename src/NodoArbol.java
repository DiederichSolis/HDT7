public class NodoArbol <K, T> {
    public T Value;
    public K Key;
    public NodoArbol<K, T> hijoIzquierdo;
    public NodoArbol<K, T> hijoDerecho;

    public NodoArbol() {
        hijoIzquierdo = null;
        hijoDerecho = null;
    }

    public NodoArbol(K key, T value) {
        Key = key;
        Value = value;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
}
