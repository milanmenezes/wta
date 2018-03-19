import java.lang.System;
import java.lang.String;
import java.util.*;

class prg4
{
 public static void main(String args[]){
 int n=Integer.parseInt(args[0]);
 int[] a=new int[n];
 for(int i=0;i<n;i++){
 a[i]=Integer.parseInt(args[i+1]);
}
 for(int i=0;i<n;i++){
 for(int j=0;j<n-i-1;j++){
 if(a[j]>a[j+1]){
 int temp=a[j+1];
 a[j+1]=a[j];
 a[j]=temp;
}
}
}

for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}  
}


