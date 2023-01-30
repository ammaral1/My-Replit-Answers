package replitAnswers79To95;

public class ReplitAnswer82 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };
        int sum=0;
        for (int[] oneDArr:a){
            for (int x: oneDArr){
                sum=sum+x;
            }

        }
        System.out.println(sum);



    }
}
