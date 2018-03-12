import java.util.*;
import java.io.*;
import java.net.*;

class prg30_server {
public static void main(String args[]) throws IOException {

ServerSocket ss = new ServerSocket(7777);
Socket s = ss.accept();
InputStream i = s.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(i));
String st;
while((st=br.readLine())!=null)
System.out.println(st);
br.close();
s.close();
ss.close();
}
}

