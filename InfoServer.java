import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;

public class InfoServer {

    public static void main(String[] args) {

        try {

            String ruta = "info.txt";

            FileWriter writer = new FileWriter(ruta);

            writer.write("Servidor activo\n");

            writer.write("Host: "
                    + InetAddress.getLocalHost().getHostName() + "\n");

            writer.write("Hora: "
                    + LocalDateTime.now() + "\n");

            writer.write("Java funcionando correctamente\n");

            writer.close();

            System.out.println("Archivo generado");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}