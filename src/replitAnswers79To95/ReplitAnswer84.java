package replitAnswers79To95;

public class ReplitAnswer84 {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int counter=0;
        for (int []oneDArray: a){

            for (int x:oneDArray){

                if (x%2!=0 && x<0){
                    counter++;

                }
            }
        }
        System.out.println(counter);







    }
}
