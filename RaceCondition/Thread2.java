class Thread2 extends Thread{


    RaceCondition rc ;

      Thread2(RaceCondition rc)
    {
        this.rc = rc;
    }
   
   //overwrites.
    public void run()
    {
       int i = 4;

         rc.isDivisibleByFive(i);


       }
    }
