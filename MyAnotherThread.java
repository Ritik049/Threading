class MyAnotherThread extends Thread{

    public void run()
    {
        //Task for thread;

        for(int i=10;i>=1;i--)
        {
            System.out.println("Another Thread = "+ i);

            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}