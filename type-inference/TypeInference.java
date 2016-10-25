public class TypeInference {
	public static void main(String[] args) {
		final Value< String > value = new Value<>();
		String v = value.getOrDefault( "22", Value.defaultValue() );
		System.out.println( v );
	}
}