public class ListarPalabra<K, T> implements IVisitar<K, T>{

	@Override
	public void VisitarNodo(NodoArbol<K, T> arbol) {

		String listado = "";
		PalabraDiccio actual = (PalabraDiccio)arbol._value;
		listado = "Espanol1: " + actual.en + " Ingles: " + actual.es + " Frances: " + actual.fr; 
		
		System.out.println(listado);
	}

	@Override
	public T VisitarNodoRegresa(NodoArbol<K, T> arbol, String key) {
		T respuesta = null;
		T actual = arbol._value;

		if((arbol._key).equals(key)){

			respuesta = actual;

		}else{

		}
		return respuesta;
	}
	
}
