import java.lang.*;
import java.util.*;

class prg8
{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  StringTokenizer st=new StringTokenizer(sc.nextLine(), " ");
  String id=st.nextToken();
  String name=st.nextToken();
  String salary=st.nextToken();
  System.out.println("Id: "+id+"\nName: "+name+"\nSalary: "+salary);
  }
}

