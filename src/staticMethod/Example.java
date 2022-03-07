package staticMethod;

interface Myinterface{
	void say();
}
public class Example {
	public static void saySomething() {
		System.out.println("Hello Method Ref");
	}
	public static void main(String[] args) {
		Myinterface MyInter = Example::saySomething;
		
		MyInter.say();

	}

}
