import java.lang.*;
import java.util.*;

interface A {
int a=10;
void avg();
}

interface B {
int a=20;
void avg();
}

class prg14 {
//float avg=new float();
public float avg(){
return (A.a+B.a)/2;
}

public static void main(String args[]){
prg14 obj= new prg14();
System.out.println(obj.avg());
}
}
