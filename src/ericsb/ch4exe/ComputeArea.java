package ericsb.ch4exe;
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
		double area = 0;
		
		
		//assign a value to radius
		System.out.println("enter the radius of a circle and press enter: ");
		radius = input.nextDouble();
		
		if (radius > 0) {
			area = radius*radius*PI;
			
			
		}
		
		System.out.println("after you entered the radius of "
				+ radius + " We have computed the area of your "
						+ "circle as: " + area +"\"");
		

	}

}