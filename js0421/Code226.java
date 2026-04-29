package js0421;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code226 {
    public static void main(String[] args) {
        BufferedReader bis = null;
        try {
            bis = new BufferedReader(new InputStreamReader(new FileInputStream("C:/myjava/chokyuho/src/js0421/data6.txt")));
            int x = 0;
            while ((x = bis.read()) != -1)
                System.out.print((char) x);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bis.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
