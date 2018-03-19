import java.lang.System;
import java.lang.String;
import java.util.*;

class prg5
{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the order of the first matrix"); 
int m=sc.nextInt();
 int n=sc.nextInt();
System.out.println("Enter the order of the second matrix");
int p=sc.nextInt();
int q=sc.nextInt();
if(n!=p){
System.out.println("Cannot Multiply");
}
else{
int[][] a=new int[m][n];
int[][] b=new int[p][q];
int[][] c=new int[m][q];

System.out.println("Enter the elements of the first matrix");

for(int i=0;i<m;i++){
 for(int j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
   //System.out.print(a[i][j]+" ");
}
}

System.out.println("Enter the elements of the second matrix");

for(int i=0;i<p;i++){
 for(int j=0;j<q;j++)
  {
   b[i][j]=sc.nextInt();
}
}

System.out.println("The Solution Matrix is:");

for(int i=0;i<m;i++){
 for(int j=0;j<q;j++){
  c[i][j]=0;
  for(int k=0;k<n;k++)
   c[i][j]+=a[i][k]*b[k][j];
  // System.out.println(c[i][j]);
}
}

for(int i=0;i<m;i++){
 for(int j=0;j<q;j++)
  {
   System.out.print(c[i][j]+" ");
}
System.out.print("\n");
}
}
  
}
}


