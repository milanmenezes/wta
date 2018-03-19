import java.lang.System;
import java.lang.String;
import java.util.*;

class prg6
{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the order of the  matrix"); 
int m=sc.nextInt();
 int n=sc.nextInt();
int[][] a=new int[m][n];
int u=0;
int l=0;

System.out.println("Enter the elements of the first matrix");

for(int i=0;i<m;i++){
 for(int j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
}
}


for(int i=0;i<m;i++){
 for(int j=i+1;j<n;j++){
  u+=a[i][j];
}
}

System.out.println("The Sum of upper triangle is: "+u);

for(int i=0;i<m;i++){
 for(int j=0;j<i;j++)
  {
   l+=a[i][j];
}
}

System.out.println("The Sum of lower triangle is: "+l);

}
  
}



