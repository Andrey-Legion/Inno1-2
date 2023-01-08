import java.util.*;

public class Main {
    public static void main(String[] args) {
      int number=39;
      int hole10=number/10, hole1=number%10, sumOfDigit=hole10+hole1, multyOfDigit=hole10*hole1;
      System.out.print(number+"\n"+hole10+"\n"+hole1+"\n"+sumOfDigit+"\n"+multyOfDigit);
  }
}