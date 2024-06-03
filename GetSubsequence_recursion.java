import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = input.next();

        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str){
        //base case
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>(); //base result
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0); //first character of string
        String ros = str.substring(1); //rest of string

        ArrayList<String> rres = new ArrayList<>(); //recursion result
        rres = gss(ros); 

        ArrayList<String> mres = new ArrayList<>(); //my result

        for (String s : rres){
            mres.add(""+s);
        }
        for (String s : rres){
            mres.add(ch+s);
        }

        return mres;
    }
}

// Output : 

// enter string : abcd
// [, d, c, cd, b, bd, bc, bcd, a, ad, ac, acd, ab, abd, abc, abcd]
