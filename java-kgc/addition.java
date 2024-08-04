import java.util.Scanner;

public class addition {
  public static void main(String[] args) {
    System.out.println("Addition of two numbers: ");
    try(Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
      int num1 = input.nextInt(); 
      System.out.print("Enter the second number: ");
      int num2 = input.nextInt(); 
      int num3 = num1 + num2; 
      System.out.println("The result of addition is: " + num3);
    }
  }
}

// 3:32:08
