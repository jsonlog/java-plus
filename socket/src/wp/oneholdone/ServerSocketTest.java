package wp.oneholdone;

/**
 * @author jsonlog
 * @date 2019-09-17
 */

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.ServerSocket;

import java.net.Socket;

public class ServerSocketTest {

    public static void main(String[] args) {

        try {

// 初始化服务端socket并且绑定9999端口

            ServerSocket serverSocket  =new ServerSocket(9999);

            //等待客户端的连接

            Socket socket = serverSocket.accept();

            //获取输入流,并且指定统一的编码格式

            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));

            //读取一行数据

            String str;

            //通过while循环不断读取信息，

            while ((str = bufferedReader.readLine())!=null){

//输出打印

                System.out.println(str);

            }

        }catch (IOException e) {

            e.printStackTrace();

        }

    }

}