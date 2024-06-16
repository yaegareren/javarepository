import java.util.Scanner;

public class userinput {
  public static void main(String[] args) {
    System.out.println("userinput ");
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter your name: ");
      String name = input.nextLine(); 
      System.out.println("Good Morning "+ name);

      System.out.print(name + " , tell me your age ");
      int age = input.nextInt(); 
      System.out.println("your age is: " + age);
    }
    
  }
}

/*
 * nextInt()
 * nextDouble()
 * nextFloat()
 * nextLong()
 */