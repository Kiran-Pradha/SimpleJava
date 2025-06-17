import java.io.*;
import java.net.*;
@SuppressWarnings("resource")


public class SimpleServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket server = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        while (true) {
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            // Basic HTTP response
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println();
            out.println("<h1>Hello from Java Web Server!</h1>");
            out.close();
            in.close();
            client.close();
        }
    }
}
