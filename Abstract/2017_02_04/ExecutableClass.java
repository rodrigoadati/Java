public class ExecutableClass{
	public static void Main(String[] args){
		System.out.println("Main Message: " + AbstractClass.Message());

		InheritanceFromAbstractClass IFAC = new InheritanceFromAbstractClass();
		System.out.println("SubClass Message: " + IFCA.Message());
	}
}
