import java.lang.*;
import java.util.*;

class Animal{
String name="ABC";
public void disp(){System.out.println("Parent Function");}  
Animal(){System.out.println("animal is created");}
  
}
  
class Dog extends Animal{
String name="DEF";
public void disp(){System.out.println("Child Function and the name is"+super.name);
super.disp();
}
Dog(){  
super();  
System.out.println("dog is created");  
}
}  
class prg11{  
public static void main(String args[]){  
Dog d=new Dog();
d.disp();  
}}  
