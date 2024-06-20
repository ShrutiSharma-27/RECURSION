import java.util.Scanner;

public class Str_Permutations_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String s = input.next();
        printPermutations(s,"");
    }

    public static void printPermutations(String ques, String asf){
        if (ques.length() == 0){
            System.out.println(asf);
        }

        for (int i=0 ; i<ques.length() ; i++){
            char ch = ques.charAt(i);
            String roq = ques.substring(0,i)+ques.substring(i+1); //rest of question = left part of question + right part of question
            printPermutations(roq, asf+ch);
        }
    }

}

// Output:

// enter string : abc
// abc
// acb
// bac
// bca
// cab
// cba
