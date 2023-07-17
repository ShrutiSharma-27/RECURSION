# RECURSION

1. What is recursion ?
* Function calling itself.

2. Why we need recursion ? (Use of recursion)
* It helps us in solving bigger/complex problems in a simple/easy way.
* You can convert the recursion solutions into iterations(not using any function calls, only loops) and vice-versa
  Tip : First solve complex problems using recursion then convert it into iteration to get a more optimised answer. Because
  directly solving using iterations is difficult that's why we use recursion.
* Space complexity isn't constant because of recursive calls.
* It helps us in breaking down bigger problems into smaller problems.

3. Visualising Recursion :

   Print_numbers_Recursion.java
<img width="1379" alt="Screenshot 2023-07-16 at 7 18 53 PM" src="https://github.com/ShrutiSharma-27/RECURSION/assets/53565103/b72ddb6b-514f-48a6-b733-257a86938175">

4. How to identify if we can solve a problem using recursion ?
* If you're able to break the pronblem into smaller subproblems then yes.
* For example : Fibonacci(N) = Fibonacci(N-1) + Fibonacci(N-2) , 1 problem is broken down into 2 subproblems and those 2 can be further divided to another subproblems.
* Basically, above expression is called as recurrence relation (recursionn in a formula).
