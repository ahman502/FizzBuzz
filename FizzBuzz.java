/* A program that outputs numbers from 1 to 100… with a catch:
For multiples of 3, print Fizz instead of the number.
For the multiples of 5, print Buzz.
For numbers which are multiples of both 3 and 5, print FizzBuzz */

public class FizzBuzz {

  public static void main (String[] args) {
    //using a for loop to iterate from number 1 to 100
    for (int i = 1; i <= 100; i++) {

      /* Since the code is executed in a top-down way, we first need to check if
      the number is divisible by both 3 and 5. There are not many numbers that are
      divisble by both, but there are many numbers that are divisible by only 3 or
      only 5, so the placement of our if statements is very important to avoid any
      logical fallacies. */

      //first we check if the number is divisible by both 3 and 5
      if (i % 3 == 0 && i % 5 == 0) {
        //if it is divisible, we print FizzBuzz instead of that number
        System.out.println("FizzBuzz");
        //we continue going through the rest of the numbers
        continue;
      }

      //next, we check if the number is divisible by only 3
      else if (i % 3 == 0) {
        //if it is divisible, we print Fizz instead of that number
        System.out.println("Fizz");
        //we continue going through the rest of the numbers
        continue;
      }

      //next, we check if the number is divisible by only 5
      else if (i % 5 == 0) {
        //if it is divisible, we print Buzz instead of that number
        System.out.println("Buzz");
        //we continue going through the rest of the numbers
        continue;
      }
      //finally, we print the numbers, one by one
       System.out.println(i);
    }
  }

}
