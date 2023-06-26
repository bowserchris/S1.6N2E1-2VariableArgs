package n2e1to2;

public class GenericMethods2 <T>{
	
	private String t1;
	private T t2;
	private T t3;
	
	//cambie primer datatipo para que sea string
	public GenericMethods2(String t1, T t2, T t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}

	public T getT3() {
		return t3;
	}

	public void setT3(T t3) {
		this.t3 = t3;
	}
	
	public void varArgString(String... strings) {
		System.out.println("The number of string objects is: " + strings.length);
		for (String i : strings) {
			System.out.println(i + " ");
			System.out.println();
		}
	}
	
	public void varArgIntWithString(String string, int... arg) {
		System.out.println("The string is: " + string);
		System.out.println("The number of int arguments is: " + arg.length);
		for (int index : arg) {
			System.out.println(index + " ");
			System.out.println();
		}
	}
	
	public void print() {
		System.out.println("The first type " + t1 + " the second type " + t2 + " the third type " + t3 + ".\r");
	}

	@Override
	public String toString() {
		return "GenericMethods [t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + "]";
	}
	
	

}
