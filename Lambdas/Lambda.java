import java.util.*;

class Lambda{
	public static void main(String[] args){
		Arrays.asList( "a", "b", "c" ).forEach( e -> System.out.println( e ) );
		
		String separator = ",";
		Arrays.asList( "a", "b", "c" ).forEach( e -> {
			System.out.print( e + separator );
		});
	}
}