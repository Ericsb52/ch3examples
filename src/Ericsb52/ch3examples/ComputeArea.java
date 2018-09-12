package Ericsb52.ch3examples;

import java.util.Scanner;

/*
 * Eric Broadbent
 * 9/18
 * compute the area of a circle
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// step one: enter the radius of a circle
		//constant declinations
		double PI = 3.1415926535979323846264338327950288419716939;
		
		
		double radius;
		double area;
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble();
		
		
		//step two: compute the area using the following formula:
		// area = radius*radius*pi
		
		area = radius*radius*PI;
		
		
		//step three: display result
		
		System.out.println("the area of your circle is:" + area +"\"");

	}

}
