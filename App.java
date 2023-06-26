package n2e1to2;

public class App {

	public static void main(String[] args) {
		
		GenericMethods2 n2e1 = new GenericMethods2("'is a string'", 1, new Person("jason", "argonaut", 25));
		
		n2e1.print();
		
		n2e1.varArgString("hello", "this", "has", "a", "lot", "of", "strings");
		
		n2e1.varArgIntWithString("the varied numbers that follow are: ", 1, 2, 5, 23, 45, 3, 7, 8);

	}
	
}

/*- Exercise 1

Modify the previous exercise so that one of the arguments 
to the generic method is not generic.
- Exercise 2

Modify the previous section so that the arguments to the generic 
method are an undefined variable argument list.
 * 
 */
