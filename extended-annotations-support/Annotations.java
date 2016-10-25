import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

public class Annotations {
	@Retention( RetentionPolicy.RUNTIME )
	@Target( { ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
	public @interface NonEmpty {
	}
	
	/* 
	The ElementType.TYPE_USE and ElementType.TYPE_PARAMETER are two
	new element types to describe the applicable annotations context.
	The Annotation Processing API also underwent some minor changes to
	recognize those new type annotations in the Java programming language.
	*/
	
	public static class Holder< @NonEmpty T > extends @NonEmpty Object {
		public void method() throws @NonEmpty Exception {
		}
	}
	
	@SuppressWarnings( "unused" )
	public static void main(String[] args) {
		final Holder< String > holder = new @NonEmpty Holder< String >();
		@NonEmpty Collection< @NonEmpty String > strings = new ArrayList<>();
	}
}