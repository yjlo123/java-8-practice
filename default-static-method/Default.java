import java.util.function.*;

class Default {
	public static void main(String[] args){
		Defaultable defaultable = DefaultableFactory.create( DefaultableImpl::new );
		System.out.println( defaultable.notRequired() );
		
		defaultable = DefaultableFactory.create( OverridableImpl::new );
		System.out.println( defaultable.notRequired() );
	}
}

interface Defaultable {
	// the implementer may or may not implement (override) default methods.
	default String notRequired() {
		return "Default implementation";
	}
}

class DefaultableImpl implements Defaultable {
}

class OverridableImpl implements Defaultable {
	@Override
	public String notRequired() {
		return "Overridden implementation";
	}
}

interface DefaultableFactory {
	// interfaces allow static methods
	static Defaultable create( Supplier< Defaultable > supplier ){
		return supplier.get();
	}
}