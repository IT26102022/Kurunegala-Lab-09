import java.util.Scanner;

public class IT26102022Lab9Q1{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		double discriminant,root1,root2,root3;
		
		
		
		System.out.print("Enter Value a: ");
		double a = input.nextDouble();
		System.out.print("Enter Value b: ");
		double b = input.nextDouble();
		System.out.print("Enter Value c: ");
		double c = input.nextDouble();
		
		discriminant = Math.pow(b,2)-(4*a*c);
		
		System.out.print("\n");
		
		if (discriminant>0){
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
		
			System.out.println("Roots are real and different : ");
			System.out.println("Root 1 : "+ String.format("%.2f",root1));
			System.out.println("Root 2 : "+ String.format("%.2f",root2));
		
		}
		else if (discriminant==0)
		{
			root3 = (-b/2*a);
			System.out.println("Roots are real and Equal : ");
			System.out.println("Root  : "+ String.format("%.2f",root3));
			
		}
	}
}