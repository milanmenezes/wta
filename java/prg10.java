import java.lang.*;
import java.util.*;

class prg10
{
 public static void main(String args[]){
  uStack s1= new uStack(50);
  Scanner sc=new Scanner(System.in);
  while(true){
  System.out.println("Enter 1 to push, 2 to pop, 3 to display, 4 to exit");
  int x=sc.nextInt();
  if(x==1){
  System.out.println("Enter the number");
  int e=sc.nextInt();
  s1.push(e);
  }
  else if(x==2)
  s1.pop();
 
  else if(x==3)
  s1.disp();

  else
  break;
}
}
                                     
  }

class uStack
{
 int[] a;
 int top;
 int n;
 
 public uStack(int n){
 this.n=n;
 this.top=-1;
 this.a= new int[n];
}

public void push(int x){
if(top==n-1)
{
 System.out.println("Stack full");
 return;
}
top++;
a[top]=x;
}

public int pop(){
if(top==-1){
System.out.println("Stack Empty");
return -1;
}
int x=a[top];
top--;
return x;
}

public void disp(){
for(int i=top;i>=0;i--)
System.out.print(a[i]+" ");
System.out.print("\n");
}
}
