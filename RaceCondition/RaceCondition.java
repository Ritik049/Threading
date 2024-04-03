class RaceCondition
{

   int n; 

   public void isDivisibleByFive(int n)
   {
    this.n = n;

      if(this.n%5==0)
      {
        System.out.println("Divisible by 5, Thread 1 executes");
      }
      else
      {
        System.out.println("Not divisible by 5,  Thread 2 executes.");
      }

   }

public static void  main(String[]args)
   {
    RaceCondition rc = new RaceCondition();
    Thread1 t1 = new Thread1(rc);
    Thread2 t2 = new Thread2(rc);

    t1.start();
    t2.start();

   }
    
}