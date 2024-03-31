class UserThread extends Thread{
    public void run()
    {
        //task for thread...
        System.out.println("This is User defined thread");
    }
}
class ThreadOperations
{
    public static void main(String[]args)
    {
        System.out.println("Program started..");

        int x = 56 + 34;

        System.out.println("Sum is "+ x);

        //Thread....
       Thread t =  Thread.currentThread();      //STAtic method.                                //Current thread object.
       String tname = t.getName();              // Here we are extracting the name of thread.
       System.out.println("Current thread is "+tname);

       //setName
       t.setName("MyMain");

       System.out.println("Current thread is "+t.getName());
       
       try{
        Thread.sleep(5000);                               //By using Thread(class itself) we can fetch currentThread, we can do sleep
       }
       catch(Exception e){
        
       }
       System.out.println(t.getId());

        System.out.println("Program ended ");


        UserThread user = new UserThread();                //Another Thread.
        user.start();
    }
}

//.get()methods used on object of thread
//To get currentThread object use Thread curr = Thread.currentThread();