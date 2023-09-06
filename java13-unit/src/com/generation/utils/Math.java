package com.generation.utils;

public class Math {
	
	public int suma(int a, int b) {
		return a + b;
	}
	// Método sobrecargado de suma
	public double suma(double a, double b) {
		return (a*1000 + b*1000)/1000;
	}
	
	public boolean isPositive(double value) {
		return value >= 0;
	}
}
