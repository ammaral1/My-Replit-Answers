package replitAnswers35To51;

import java.util.Scanner;

public class Replit39 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your mark");
       int mark=scan.nextInt();
       if (mark >=1 && mark<25){
           System.out.println("F");
       }else if (mark>=25 && mark<45){
           System.out.println("E");
       }else if (mark>=45 && mark<50){
           System.out.println("D");
       }else if (mark>=50 && mark<60){
           System.out.println("C");
       }else if (mark>=60 && mark<80){
           System.out.println("B");
       }else if (mark>=80){
           System.out.println("A");
       }else {
           System.out.println("Please enter valid mark");
       }




    }
}
