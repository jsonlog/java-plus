package wp.nio;

/**
 * @author jsonlog
 * @date 2019-09-18
 */
import java.io.IOException;

import java.net.InetSocketAddress;

import java.nio.ByteBuffer;

import java.nio.channels.ServerSocketChannel;

import java.nio.channels.SocketChannel;

import java.nio.charset.Charset;

public class ServerSocketTest {

    public static void main(String[] args) {

        try {

            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

            serverSocketChannel.bind(new InetSocketAddress(9000));

            serverSocketChannel.configureBlocking(false);

            while (true){

                SocketChannel socketChannel = serverSocketChannel.accept();

                while (socketChannel!=null){

                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

                    int i = socketChannel.read(byteBuffer);

                    byteBuffer.flip();

                    System.out.println(Charset.defaultCharset().newDecoder().decode(byteBuffer)

                            .toString());

                }

            }

        }catch (IOException e) {

            e.printStackTrace();

        }

    }

}
