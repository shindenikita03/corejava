package com.example.main;
import com.example.shapes.Circle;
public class MainApp {
	public static void main (String[] args) {
		Circle circle= new Circle(3.0);
		System.out.println("area of the circle is"+ circle.area());
	}

}
