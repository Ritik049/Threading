class Consumer extends Thread{

    Company c;    //WE need this object to use function like consumeItem

     Consumer(Company c)
     {
        this.c = c;
     }
     
     public void run()
     {
        while(true)
        {
            try
            {
             this.c.consumeItem();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
     }
}