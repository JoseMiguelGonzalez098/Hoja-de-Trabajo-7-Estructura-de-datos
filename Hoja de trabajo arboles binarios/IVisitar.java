public interface IVisitar<K, T> {
	public void VisitarNodo(NodoArbol<K, T> arbol);
	public T VisitarNodoRegresa(NodoArbol<K, T> actual, String key);
}
