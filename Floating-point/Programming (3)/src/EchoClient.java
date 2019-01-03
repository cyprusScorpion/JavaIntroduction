import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  public static final String SERVER_ADDRESS = "127.0.0.1";
  public static final int SERVER_PORT = 34522;

  public static void main(String[] args) {
    try (
      Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
      DataInputStream input = new DataInputStream(socket.getInputStream());
      DataOutputStream output = new DataOutputStream(socket.getOutputStream())
      ) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your message to Server: ");
      String msg = scanner.nextLine();
      output.writeUTF(msg);
      String receivedMsg = input.readUTF();
      System.out.println("Received from server: " + receivedMsg);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
