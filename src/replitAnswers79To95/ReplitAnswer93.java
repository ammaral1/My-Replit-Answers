package replitAnswers79To95;

public class ReplitAnswer93 {
    public static void main(String[] args) {

        String str="abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";


        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='c'){
                System.out.println(i);
            }
            if (str.charAt(i)==' '){
                System.out.println(i);
            }
    }

        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));




    }}


