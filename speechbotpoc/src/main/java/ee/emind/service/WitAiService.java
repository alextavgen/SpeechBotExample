package ee.emind.service;
import ee.emind.model.Audio;
import lombok.Data;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Base64;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by aleksandr on 07/05/2017.
 */
@Data
@Component
@ConfigurationProperties(prefix="witai")
public class WitAiService {
    private static final Logger logger = LogManager.getLogger(WitAiService.class);

    private String url;
    private String key;

    private String version;
    private String command;
    private String charset;


    public String processAudio(Audio audio) throws IOException {

        URLConnection connection = getUrlConnection();

        OutputStream outputStream = connection.getOutputStream();

        byte[] decoded;
        decoded = Base64.getDecoder().decode(audio.getContent());

        outputStream.write(decoded);
        BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder sb = new StringBuilder();
        String line;
        while((line = response.readLine()) != null) {
            sb.append(line);
        }
        logger.info("Received from Wit.ai: " + sb.toString());
        return sb.toString();
    }

    private URLConnection getUrlConnection() {
        String query = null;
        try {
            query = String.format("v=%s", URLEncoder.encode(version, charset));
            logger.info("Query string for wit.ai: " + query);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        URLConnection connection = null;
        try {
            connection = new URL(url + "?" + query).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        connection.setRequestProperty ("Authorization","Bearer " + key);
        connection.setRequestProperty("Content-Type", "audio/wav");
        connection.setDoOutput(true);

        return connection;
    }

}
