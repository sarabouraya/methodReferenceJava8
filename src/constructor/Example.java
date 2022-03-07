package constructor;
interface MyInterface{
	Example getExample();
}
public class Example {
	Example(){
		System.out.println("From constructor");
	}
}
class App {

	public static void main(String[] args) {
		MyInterface muIn = Example::new;
		muIn.getExample();

	}

}
