
import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class Fibonacci
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    FibonacciSearchAlgorithm fib = new FibonacciSearchAlgorithm();
    //System.out.print(myObject);
    fib.printFibonacci(0,100);
  }
}

// you can add other public classes to this editor in any order
public class FibonacciSearchAlgorithm
{
  FibonacciSearchAlgorithm(){
  }
  private long getLastNextFibonacci(long num){
    if(num==0)return 1;
    long temp=num;
    for(;;){
    if(isFibonacci(temp)) return temp;
      temp++;
    }
  }
  private long getLastPreviousFibonacci(long num){
    if(num==0)return 0;
    long temp=num-1;
    for(;;){
    if(isFibonacci(temp)) return temp;
      temp--;
    }
  }
  public void printFibonacci(long init, long end){
    long Fib0=getLastPreviousFibonacci(init);
    long Fib1=getLastNextFibonacci(init);
    long Fib2=0;
    for(;Fib1+Fib0<=end;){
      Fib2=Fib1+Fib0;
      System.out.println(Fib2);
      Fib0=Fib1;
      Fib1=Fib2;
    
    }
  }
  
  
  //A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4) is a perfect square (Source: Wiki)
  
 public boolean isPerfectSquare(long x)
{
    long s =(long)Math.sqrt(x);
    return (s*s == x);
}
 
// Returns true if n is a Fibinacci Number, else false
public boolean isFibonacci(long n)
{
    // n is Fibinacci if one of 5*n*n + 4 or 5*n*n - 4 or both
    // is a perferct square
    return isPerfectSquare(5*n*n + 4) ||
           isPerfectSquare(5*n*n - 4);
}
  
  
}
