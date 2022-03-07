package staticMethod;

import java.util.function.BiFunction;

class Operation{
	public static double add(double a, double b) {
		return a+b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
	public static double sub(double a, double b) {
		return a-b;
	}
}
public class Example2 {
	
	public static void main(String[] args) {
		
		BiFunction<Double, Double, Double> addMethod = Operation::add;
		BiFunction<Double, Double, Double> MultiplyMethod = Operation::multiply;
		BiFunction<Double, Double, Double> subMethod = Operation::sub;
		
		double result = addMethod.apply(3d,3d);
		double result1 = MultiplyMethod.apply(3d,3d);
		double result2 = subMethod.apply(3d,3d);
		System.out.println("+ :"+result);
		System.out.println("* :"+result1);
		System.out.println("- :"+result2);
	}

}
