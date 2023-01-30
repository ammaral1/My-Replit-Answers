package replitAnswers79To95;

public class ReplitAnswer80 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        
        for (double [] oneDArray: a){
            for (double x: oneDArray){
                System.out.print(x*2+" ");

            }
            System.out.println();

        }



    }
}
