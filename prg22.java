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

class prg22 {
	public static void main(String args[]){
    A t1= new A();
    A t2= new A();
    if(t1.isAlive())
    	System.out.println("T1 alive");

    if(t2.isAlive())
    	System.out.println("T2 alive");
    
    t1.start();
    t2.start();
    System.out.println("t1 priority: "+t1.getPriority());
    System.out.println("t2 priority: "+t2.getPriority());
    System.out.println("Changing priority of t2");
    t2.setPriority(10);
    System.out.println("t1 priority: "+t1.getPriority());
    System.out.println("t2 priority: "+t2.getPriority());
 	t1.yield();
 try{
    t1.join();
    t2.join();
    
}
catch(Exception e){}

	  
	}
}
