import java.lang.*;
import java.util.*;
class A extends Thread{
public void run(){
	Thread t = Thread.currentThread();
	System.out.println("In thread"+t.getId());
    try{
    t.sleep(500);
}
catch (Exception e)
{}
}
}

class prg20 {
	public static void main(String args[]){
    A t1= new A();
    A t2= new A();
    if(t1.isAlive())
    	System.out.println("T1 alive");

    if(t2.isAlive())
    	System.out.println("T2 alive");
    
    t1.start();
    t2.start();
 



    if(t1.isAlive())
    	System.out.println("T1 alive");

    if(t2.isAlive())
    	System.out.println("T2 alive");

	   try{
    t1.join();
    t2.join();
}
catch(Exception e){}
	}
}
