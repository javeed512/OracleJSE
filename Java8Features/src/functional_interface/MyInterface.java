package functional_interface;


@FunctionalInterface
public interface MyInterface { // functional interface having only one abstract

	public abstract int add(int a, int b);

	public static void m1() {

		System.out.println("m1() from interface");

	}

	public default void m2() {

		System.out.println("m2() default method from interface");

	}

}
