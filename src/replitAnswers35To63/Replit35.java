package replitAnswers35To63;

import java.util.Scanner;

public class Replit35 {
    public static void main(String[] args) {
        System.out.println("Do you need loan?");
        Scanner scan=new Scanner(System.in);
        boolean yesOrNo=scan.nextBoolean();

        if (yesOrNo){
            System.out.println("What is your credit score?");

            int score=scan.nextInt();
            if (score<600){
                System.out.println("Not eligible");
            }else if (score>=600 && score<=700){
                System.out.println("Maybe eligible");
            }else if (score>700 && score<=800){
                System.out.println("Eligible");
            }else if (score>800){
                System.out.println("Definitely");
            }


        }else{
            System.out.println("Unknown");
        }
    }
}
