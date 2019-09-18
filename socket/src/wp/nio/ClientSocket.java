package wp.nio;

/**
 * @author jsonlog
 * @date 2019-09-18
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class ClientSocket {

    public static void main(String[] args) {
        Socket socket;

        {
            try {
                socket = new Socket("127.0.0.1",9000);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("你好".getBytes());
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}