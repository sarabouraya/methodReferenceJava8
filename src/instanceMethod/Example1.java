package instanceMethod;

import java.util.function.BiFunction;

class Operation{
	public double add(double a, double b) {
		return a+b;
	}
}
public class Example1 {
	
	public static void main(String[] args) {
		BiFunction<Double, Double, Double> Addoperation = new Operation()::add;
		System.out.println(Addoperation.apply(5d, 5d));
	}
}
