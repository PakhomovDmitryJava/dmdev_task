package mvc.servlets.http;

import java.io.IOException;
import java.net.URL;

public class UrlExample  {
    public static void main(String[] args) throws IOException {
        var url = new URL("file:C:\\java\\dmdev\\dmdev_tasks\\Gradle\\src\\main\\java\\servlets\\TCPandUDP\\DatagramRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }


    private static void checkGoogle() throws IOException {
        var url = new URL("https://google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoInput(true);
        try (var outputStream = urlConnection.getOutputStream()) {
        }
        System.out.println();
    }


}
