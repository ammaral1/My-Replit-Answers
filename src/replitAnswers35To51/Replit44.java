package replitAnswers35To51;

import java.util.Scanner;

public class Replit44 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
      String car=scan.next();

      switch (car){
          case "BMW":
              System.out.println("your favorite car is GERMAN CAR");
              break;
          case "Toyota":
              System.out.println("your favorite car is japanese car");
              break;
          case "Maserati":
              System.out.println("Your favorite car is italian car");
              break;
          default:
              System.out.println("Your favorite car is unknown");


      }








    }
}
