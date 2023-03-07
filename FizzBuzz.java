public class FizzBuzz
{
  public static void main(String[] args)
  {
    FizzBuzz buzz = new FizzBuzz();
    buzz.printBuzz();
  }
 public void printBuzz()
 {
   for(int i = 1; i < 100; i++)
   {
     if(i%3 == 0)
     {
       System.out.println("Fizz");
     }
     else if(i%5==0)
     {
       System.out.println("Buzz");
     }
     else
     {
       System.out.println(i);
     }
   }
 }
}