public class GetKey <K, T> implements IKeyCalculator<K, T>{

    @Override
    public K GetKey(T value) {
        PalabraDiccio palabra = (PalabraDiccio)value;
		return (K)palabra;
    }
    
}