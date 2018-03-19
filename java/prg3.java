import java.lang.System;
import java.lang.String;
import java.util.*;

class prg3
{
 public static void main(String args[]){
 int m=Integer.parseInt(args[0]);
 int n=Integer.parseInt(args[1]);
 for(int i=1;i<=m;i++){
 for(int j=1;j<=n;j++){
 System.out.print((i*j)+" "); 
}
System.out.print("\n");
}  
}
}

