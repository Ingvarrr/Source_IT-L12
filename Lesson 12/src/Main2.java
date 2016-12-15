import java.io.*;

/**
 * Created by vig on 11/11/16.
 */

public class Main2 {
    public static void main(String[] args) throws IOException{
        byte[] array = {2, 56, 56, 63, 5, 8, 45, 21, 78, 51, 96}; // "fidsfgsd".getBytes()
        ByteArrayInputStream is =
                new ByteArrayInputStream(array);

        /*InputStream inputStream = new
                BufferedInputStream(
                new FileInputStream("src/Main.java"));
*/
        DataInputStream inputStream = new DataInputStream(is);
        int data;
        while ((data = inputStream.readInt()) != -1) {
//        while ((data = is.read()) != -1) {
            System.out.println(data);

        System.out.println("-----------");
            is.reset();
            do {
            data = is.read();
            System.out.println(data);
            }
            while (data !=-1);
        }
    }
}
