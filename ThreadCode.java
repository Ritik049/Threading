import java.lang.*;

//Creating our thread using Runnable Interface.
//** Java has rule that if you implement any interaface in any class they you need to overwrite all the methods of interface */
class ThreadCode implements Runnable{


    public void run()
    {
        //Task for thread...
        for(int i=1;i<=10;i++)
        {
            System.out.println("Value of i is "+i);
            try{
                Thread.sleep(1000);                         //WE ARE CONTROLLING THREAD by controlling.
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }


    public static void main(String[]args)                  //it is normal single threading process you can write main function in normal class implementing runnable  interface and thread class 
    {
        //CREATE object of threadCode class

        ThreadCode t1 = new ThreadCode();                      //YOU CAN WRITE INSTANCE OF SAME CLASS IN MAIN.

        // t1.start();        //Give error;

        Thread thr = new Thread(t1);                  //Passing reference of object ThreadCode.  
       
        //OBJECT OF ANOTHER THREAD

        MyAnotherThread t2 = new MyAnotherThread();


        thr.start();                                 //PRINTING is done through this thread.
        t2.start();
    }

  
}

//3 threads main thread, thread1, thread2,
//Main thread start both thread, and self destroy.








