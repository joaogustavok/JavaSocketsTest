import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            var s = new Socket("localhost", 6666);
            var dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Ola Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
