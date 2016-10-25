import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		Optional< String > fullName = Optional.ofNullable( null );
		System.out.println( "Full Name is set? " + fullName.isPresent() );
		System.out.println( "Full Name: " + fullName.orElseGet( () -> "[None]" ) );
		System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		
		Optional< String > fullName2 = Optional.ofNullable( "Tom" );
		System.out.println( "Full Name is set? " + fullName2.isPresent() );
		System.out.println( "Full Name: " + fullName2.orElseGet( () -> "[None]" ) );
		System.out.println( fullName2.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
	}
}