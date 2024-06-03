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
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = new ArrayList<>();
        rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();

        for (String s : rres){
            mres.add(""+s);
        }
        for (String s : rres){
            mres.add(ch+s);
        }

        return mres;
    }
}
