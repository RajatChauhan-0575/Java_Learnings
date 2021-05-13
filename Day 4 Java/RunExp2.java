public class RunExp2 extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        RunExp2 t1=new RunExp2 ();    
        // It does not start a separate call stack   
        t1.start();   
		t1.start();
    }    
}   