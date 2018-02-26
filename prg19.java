import java.lang.*;
import java.util.*;
class prg19 {
public static void main(String args[]) throws Exception{
	throw new myException("Demonstrating Exception"); 
}
}

class myException extends Exception{
	myException(String a){
	super(a);
}
}