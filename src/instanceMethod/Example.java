package instanceMethod;
interface MyInterface{
	void say();
}
public class Example {
	public void saySomething() {
		System.out.println("Hello ");
	}
	public static void main(String[] args) {
		//Non static using reference
		Example methodRef = new Example();
		MyInterface mIn1 = methodRef::saySomething;
		mIn1.say();
		//anonymous object 
		MyInterface mIn = new Example()::saySomething;
		mIn.say();
	}
}
