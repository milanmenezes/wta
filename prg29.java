import java.util.*;
import java.io.*;

class prg29{
public static void main(String args[]) throws IOException {
FileReader f;
try{
	f= new FileReader(args[0]);
}
catch(FileNotFoundException e){
	System.out.println("File Not Fount");
	return;
}
BufferedReader br = new BufferedReader(f);
int ch;

while ( (ch = br.read())!= -1)
System.out.print((char)ch);
f.close();
}
}

