import java.util.*;
import java.io.*;

class prg28{
public static void main(String args[]) throws IOException {
DataInputStream d = new DataInputStream(System.in);
FileOutputStream fos = new FileOutputStream("abc.txt");
BufferedOutputStream b = new BufferedOutputStream(fos,1024);
int ch;
while ( (ch = d.read())!= -1)
b.write(ch);
b.close();
}
}

