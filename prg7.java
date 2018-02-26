import java.lang.System;
import java.lang.String;
import java.util.*;

class prg7
{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the order of the  matrix"); 
int m=sc.nextInt();
 int n=sc.nextInt();
int[][] a=new int[m][n];
int u=0;
int l=0;

System.out.println("Enter the elements of the matrix");

for(int i=0;i<m;i++){
 for(int j=0;j<n;j++)
  {
   a[i][j]=sc.nextInt();
}
}

System.out.println("The Transpose is:");
for(int i=0;i<n;i++){
 for(int j=0;j<m;j++){
  System.out.print(a[j][i]+" ");
}
System.out.print("\n");
}

}  
}



