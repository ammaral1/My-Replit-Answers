package replitAnswers79To95;

import java.util.Arrays;

public class ReplitAnswer83 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
       int []intArray=new int[a.length];
        int sumForEachRow=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
               sumForEachRow=sumForEachRow+a[i][j];
               // System.out.print(a[i][j]+" ");
            }
            intArray[i]=sumForEachRow;
            System.out.println(intArray[i]);
            sumForEachRow=0;

        }

       // System.out.println(Arrays.toString(intArray));




    }
}
