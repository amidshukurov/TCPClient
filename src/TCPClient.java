import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",6789);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

       // dataOutputStream.write("I am data from client".getBytes());
        byte[] bytes = FileUtility.readBytes("C:\\Users\\User\\Desktop\\forCV.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        dataOutputStream.close();

    }
}
