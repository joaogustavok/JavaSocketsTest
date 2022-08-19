import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            var ss = new ServerSocket(6666);
            var s = ss.accept(); //establishes connection
            var dis = new DataInputStream(s.getInputStream());
            var str = (String) dis.readUTF();
            System.out.println("Mensagem: " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
