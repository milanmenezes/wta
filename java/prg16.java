import java.lang.*;
import java.util.*;

interface A{
int a=5;
public void display();
}

class B implements A{
public void display(){
System.out.println(a);
}
}

class prg16 {
public static void main(String args[]){
B obj=new B();
obj.display();
}
}
