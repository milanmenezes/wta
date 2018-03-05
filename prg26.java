import java.lang.*;
import java.util.*;

class prg26 {
	public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String key;
     int i;
     System.out.println("Enter the strings seperated by whitespace");
     String s[] = sc.nextLine().split(" ");
     System.out.println("Enter the string to be searched");
     key=sc.nextLine();
     for(i=0;i<s.length;i++){
     	if(s[i].equals(key)){
     		break;
     	}
     }
     if(i!=s.length)
     	System.out.println("String found at position: "+i);
     else
     	System.out.println("String not found");
	}
}