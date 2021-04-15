public class KeyPalabra<K, T> implements IKeyCalculator<K, T> {

	@Override
	public K GetKey(T value) {
		PalabraDiccio actual = (PalabraDiccio)value;
		return (K)actual.ID;
	}

}