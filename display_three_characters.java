import java.util.Scanner;
public class display_three_characters {
  public static void main(String[] args) {
    String char_1, char_2, char_3, welcome_message;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first character");
    char_1 = input.next();
    System.out.println("Enter second character");
    char_2 = input.next();
    System.out.println("Enter third character");
    char_3 = input.next();
    welcome_message = "Hello " +char_1+char_2+char_3+ "!! We hope you have a nice day";
    System.out.println(welcome_message);
  }
}
