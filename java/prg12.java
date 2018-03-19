import java.lang.*;
import java.util.*;

class prg12
{
 public static void main(String args[]){
  Stack<Integer> st=new Stack<Integer>();
  Scanner sc=new Scanner(System.in);
  while(true){
  System.out.println("Enter 1 to push, 2 to pop, 3 to search, 4 to exit");
  int x=sc.nextInt();
  if(x==1){
  System.out.println("Enter the number");
  int e=sc.nextInt();
  st.push(e);
  }
  else if(x==2){ 
 int e=(int) st.pop();
 System.out.println();
}
 
  else if(x==3)
  {
 System.out.println("Enter the element to search");
 int e=sc.nextInt();
 System.out.println(st.search(e));
}

  else
  break;
}
}          
  }

