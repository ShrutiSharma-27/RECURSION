import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypadCombinations_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter String : ");
        String s = input.next();
        System.out.println(getKC(s));
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; //global array

    public static ArrayList<String> getKC(String s){ //calling for 678
        if (s.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0); //6
        String ros = s.substring(1); //78

        ArrayList<String> rres = getKC(ros); //recursion result for 78
        ArrayList<String> mres = new ArrayList<>(); //my result for 678

        String to_be_attached = codes[ch-'0'];
        int len = to_be_attached.length();

        for (int i=0 ; i<len ; i++){
            char each = to_be_attached.charAt(i);
            for (String str: rres){
                mres.add(each+str);
            }
        }
        return mres;
    }
}
