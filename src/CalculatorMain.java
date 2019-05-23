import java.util.Scanner;
public class CalculatorMain {
 public static void main(String[] args) {
	 Scanner user_input = new Scanner(System.in);
	 
	 while(true) {
		 System.out.println("Enter first number");
		 int firstNumber = user_input.nextInt();
		 System.out.println("Enter second number");
		 int secondNumber = user_input.nextInt();
		 double additionResult = Calculator.addition(firstNumber,secondNumber);
		 double  multiplicationResult = Calculator.mult(firstNumber,secondNumber);
		 double substactionResult = Calculator.substraction(firstNumber, secondNumber);
		 double divisionResult = Calculator.division(firstNumber,secondNumber);
		 
		 System.out.println("The addition result is: " + additionResult);
		 System.out.println("The substraction result is: " +  substactionResult );
		 System.out.println("The multiplication result is: " + multiplicationResult);
		 System.out.println("The division result is: " + divisionResult);
		 
		 System.out.println("Do you want to continue y/n");
		 char input = user_input.next().charAt(0); 
		 if(input == 'n') {
			 break;
		 }
	 }
	 }
	
	
}
