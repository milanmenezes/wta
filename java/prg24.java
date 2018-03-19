import java.lang.*;
import java.util.*;

class prg24 {
	public static void main(String args[]){
     String a="abc";
     String b="abc";
     String c = new String("abc");
     String d = new String("abc");
     
     System.out.println("Using == operator:");
     System.out.println(a==b);
     System.out.println(c==d);
     System.out.println(a==c);

     System.out.println("Using equals() function:");
     System.out.println(a.equals(b));
     System.out.println(c.equals(d));
     System.out.println(a.equals(c));
	}
}