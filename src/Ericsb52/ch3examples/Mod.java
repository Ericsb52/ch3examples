package Ericsb52.ch3examples;
import java.util.Scanner;
import static java.lang.System.out;

/*
 * Eirc
 * 9/18
 */
public class Mod {

	public static void main(String[] args) {
		int quarters;
		int dimes;
		int nickels;
		int cent;
		int total;
		int whatsLeft;
		boolean greaterThan4;
		
		Scanner input = new Scanner(System.in);
		out.print("how much change is in your pocket");
		total = input.nextInt();
		quarters = total / 25;
		whatsLeft = total % 25;
		dimes = whatsLeft /10;
		whatsLeft = whatsLeft % 10;
		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		cent = whatsLeft;
		out.println("from "+total+ " cents you get" );
		out.println("Quarters: "+quarters+" Dimes: "+dimes+" Nickels: "+nickels+" cents: "+cent);
		greaterThan4 =  quarters >=4;
		out.println(greaterThan4);
		
		
		
		

	}

}
