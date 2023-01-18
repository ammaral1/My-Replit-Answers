package replitAnswers64To70;


import java.util.Scanner;

public class ReplitAnswer76 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String []days=new String [7];
        for (int i=0;i<7;i++){
            int revisedDay=i+1;

            System.out.println("Please enter day " +revisedDay+ " of the week");
            String dayName=scan.next();
            days[i]=dayName;

        }
        for (int j=0;j<7;j++){
            System.out.println(days[j]);

        }






        }



    }

