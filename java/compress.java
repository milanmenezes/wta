import java.util.zip.*;
import java.io.*;

class compress{
public static void main(String args[]) throws IOException {
FileInputStream fis = new FileInputStream("abc.txt");
FileOutputStream fos = new FileOutputStream("File1");
DeflaterOutputStream dos = new DeflaterOutputStream(fos);
int data;
while (( data = fis.read())!=-1)
dos.write(data);
fis.close();
dos.close();

FileInputStream fis1 = new FileInputStream("File1");
FileOutputStream fos1 = new FileOutputStream("abc2.txt");
InflaterInputStream dos1 = new InflaterInputStream(fis1);
int data1;
while (( data1 = dos1.read())!=-1)
fos1.write(data1);
fis1.close();
dos1.close();

}
}

