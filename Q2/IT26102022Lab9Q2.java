import java.util.Scanner;

public class IT26102022Lab9Q2{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		
		double radius,area;
		
		
		System.out.print("Enter the radius of the circle : ");
		radius=input.nextDouble();
		
		area=Math.PI*radius*radius;
		
		System.out.println("The area of the circle with radius "+ radius +" is : "+ area );
		
	}
}