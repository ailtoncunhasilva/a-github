package entities;

public class Triangle {
	
	//dentro desta classe vamos declarar os atributos:
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) /2;
		return Math.sqrt(p * (a - p) * (b - p) * (c - p));
	}
}
