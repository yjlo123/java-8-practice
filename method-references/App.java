import java.util.function.*;
import java.util.*;

class Car {
	public static Car create( final Supplier< Car > supplier ) {
		return supplier.get();
	}
	
	public static void collide( final Car car ) {
		System.out.println( "Collided " + car.toString() );
	}
	
	public void follow( final Car another ) {
		System.out.println( "Following the " + another.toString() );
	}
	
	public void repair() {
		System.out.println( "Repaird " + this.toString() );
	}
}

public class App {
	public static void main( String[] args ) {
		final Car car = Car.create( Car::new );
		final List< Car > cars = Arrays.asList( car );
		cars.forEach( Car::collide );
		cars.forEach( Car::repair );
		
		final Car police = Car.create( Car:: new );
		cars.forEach( police::follow );
	}
}