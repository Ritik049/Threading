import java.util.*;
class ThreadPractice
{   

    
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        //CREATE TWO INSTANCES of sum thread for two differnt ranges.
        SumThread sumThread1 = new SumThread(1,Integer.MAX_VALUE/2);
        SumThread sumThread2 = new SumThread(Integer.MAX_VALUE/2 + 1,Integer.MAX_VALUE);

        //START both threads
        sumThread1.start();          //Implement run function.
        sumThread2.start();

        //Wait for both threads to finish
        sumThread1.join();                 //Finish the thread.
        sumThread2.join();

        //GET THE SUM calculated by each thread
        long sum1 = sumThread1.getSum();
        long sum2 = sumThread2.getSum();

        //Calculate the final sum
        long finalSum = sum1 + sum2;

        long end = System.currentTimeMillis();

        System.out.println("Two Thread final count = "+ finalSum + " took "+(end-start)+ " "+milliseconds);         
    }

}

class SumThread extends Thread{


    private long startRange;
    private long endRange;

    private long sum;

    public SumThread(long startRange, long endRange)
    {
        this.startRange = startRange;
        this.endRange = endRange;
    }
    public void run()
    {
        sum= 0;
        for(long i= startRange; i<=endRange; i++)
        {
            sum+=i;
        }
    }

    public long getSum()
    {
        return sum;
    }
}