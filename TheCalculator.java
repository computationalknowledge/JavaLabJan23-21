import java.util.Arrays; 
import java.util.EnumSet; 

public class Calculator {

	public static void main(String[] args) { 
		
		
		for (RunManager.MathOps somevar : RunManager.MathOps.values())  {
			
			 RunManager.Run(somevar);
			
		}
	}
	
	
}

class RunManager{
	
	public  enum MathOps{
		  Add, 
		  Sub, 
		  Mult, 
		  Div
		}
	
	
	
	public static void Run(MathOps op) {
		
		Operations o = new Operations();
		
		switch(op.toString()) {
		case "Add":
			System.out.println("ADDING");
			for (int a=0; a<10; a++) {
				for (int j=0; j<10; j++) {
					System.out.print(o.Add(a, j));
					System.out.print(";");
				}
				System.out.println();
			}			
			break;
			
		case "Sub":
			System.out.println("SUBTRACTING");
			for (int a=0; a<10; a++) {
				for (int j=0; j<10; j++) {
					System.out.print(o.Subtract(a, j));
					System.out.print(";");
				}
				System.out.println();
			}			
			break;

		case "Mult":
			System.out.println("MULTIPLYING");
			for (int a=0; a<10; a++) {
				for (int j=0; j<10; j++) {
					System.out.print(o.Multiply(a, j));
					
				}
				System.out.println();
			}			
			break;
			
		case "Div":
			System.out.println("DIVIDING");
			for (int a=0; a<10; a++) {
				for (int j=1; j<10; j++) {
					System.out.print(o.Divide(a, j));
					System.out.print(";");
				}
				System.out.println();
			}			
			break;
			
		}
		

	}
}

class Operations {
	public  float Add(float input1, float input2) {
		return input1 + input2 ;
	}
	
	public  float Subtract(float input1, float input2) {
		return input1 - input2 ;
	}
	
	public  float Multiply(float input1, float input2) {
		return input1 * input2 ;
	}
	
	public  float Divide(float input1, float input2) {
		return input1 / input2 ;
	}
}
