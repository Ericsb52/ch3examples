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
		
		//constant declinations
		final double PI = 3.1415926535979323846264338327950288419716939;
		 
		// step one: enter the radius of a circle
		double radius;
		double area;
		
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble();
		System.out.println(radius);
		
		//step two: compute the area using the following formula:
		// area = radius*radius*pi
		area = radius*radius*PI;
		
		//step three: display result
		System.out.println("after you entered the radius of "
		+ radius + " We have computed the area of your "
				+ "circle as: " + area +"\"");

	}

}
