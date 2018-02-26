import java.lang.*;
import java.util.*;

class prg9
{
 public static void main(String args[]){
  student s1=new student("4ni15cs132","Milan","CS","9481211903");
  s1.printobject();
  
  }
}

class student
{
 String usn;
 String name;
 String branch;
 String phone;
 
 public student(String usn, String name, String branch, String phone){
 this.usn=usn;
 this.name=name;
 this.branch=branch;
 this.phone=phone;
}
 
 public void printobject(){
 System.out.println("USN: "+this.usn+"\nName: "+this.name+"\nBranch: "+this.branch+"\nPhone: "+this.phone);
}
}


