import java.lang.*;
import java.util.*;

abstract class A{
abstract public void display();
}

class B extends A{
public void display(){
System.out.println("Display function");
}
}

class prg15 {
public static void main(String args[]){
A obj=new B();
obj.display();
}
}
