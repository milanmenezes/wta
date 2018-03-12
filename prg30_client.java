import java.util.*;
import java.io.*;
import java.net.*;

class prg30_client{
public static void main(String args[]) throws Exception{
Socket s = new Socket("localhost",7777);
OutputStream o = s.getOutputStream();
PrintStream ps = new PrintStream(o);
ps.println("Hello");
ps.close();
s.close();
}
}

