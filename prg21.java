import java.lang.*;
import java.util.*;
class A extends Thread{
public void run(){
	Thread t = Thread.currentThread();
	System.out.println("In thread"+t.getId());
    try{
    t.sleep(5000);
}
catch (Exception e)
{}
}
}

class prg21 {
	public static void main(String args[]){
    A t1= new A();
    A t2= new A();
    if(t1.isAlive())
    	System.out.println("T1 alive");

    if(t2.isAlive())
    	System.out.println("T2 alive");
    
    t1.start();
    t2.start();
 	t1.yield();
 	t2.stop();

 	

    if(t1.isAlive())
    	System.out.println("T1 alive");

 try{
    t1.join();
    
}

catch(Exception e){}

    if(t2.isAlive())
    	System.out.println("T2 alive");

	  
	}
}
