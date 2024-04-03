class Company{
   
   int n;

   boolean f = false;        //HELPS IN INTER THREAD Communication.
   //if f = false then chance:Producer
   //if f = true then chance : Consumer.

   
   //public synchronized void produceItem(int n)   both are correct format.        more correct.
   synchronized public void produceItem(int n) throws Exception
    {  if(f)
         {
           wait();
         }
    
    
        this.n = n;
        System.out.println("Produced Item "+this.n);         //Remember here used this.n not n.
        f = true;
        notify();
    }

   synchronized public int consumeItem() throws Exception                          //due to wait we use throws Exception
    {   if(!f)
          {
            wait();
          }
    
          System.out.println("Consumed Item "+ this.n);
          f = false;
          notify();                                           //IT notify that ts work get completed.
          return this.n;
    }
}