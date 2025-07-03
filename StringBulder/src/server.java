import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws Exception{
        int n,temp;
        ServerSocket obj = new ServerSocket(1211);
        Socket s = obj.accept();
        Scanner sc = new Scanner(s.getInputStream());
        n = sc.nextInt();

        temp = n*2;
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(temp);

    }
}
