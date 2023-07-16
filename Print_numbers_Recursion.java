//base condition in recursion : condition where our recursion will stop making new calls
//no base condition -> function calls will keep happening -> stack will be filled again and again -> memory of computer will exceed the limit -> stack overflow error

public class Print_numbers_Recursion {
    public static void main(String[] args) {
        //to print 1 to 5 numbers
        print(1);
    }

    static void print(int n) {

        //below is the base condition
        if (n == 5) System.out.println(5); //no need to call any function when the value is 5 to terminate the function.
        else {
            System.out.println(n);

            //recursive call
            //if you're calling a function again and again, you can treat it as a separate call in the stack
            //each function call will occupy separate memory space in stack
            print(n + 1);
        }
    }
    //or you can write in this way inside function :
    // if (n==5) {
    //     System.out.println(5);
    //     return;
    // }
    // System.out.println(n);
    // print(n + 1);
}
