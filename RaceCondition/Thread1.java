class Thread1 extends Thread{


    RaceCondition rc ;

    Thread1(RaceCondition rc)
    {
        this.rc = rc;
    }
   
   //overwrites.
    public void run()
    {
       int i = 5;


        rc.isDivisibleByFive(i);
     
    
        
    }
}