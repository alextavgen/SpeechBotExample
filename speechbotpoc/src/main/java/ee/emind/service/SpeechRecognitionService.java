package ee.emind.service;

import ee.emind.model.Audio;
import ee.emind.model.Config;
import ee.emind.model.RecognitionSpeechModelRequest;
import ee.emind.model.googlemodel.Results;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by aleksandr on 07/05/2017.
 */
@Data
@Component
@ConfigurationProperties(prefix="speechrecognition")
public class SpeechRecognitionService {

    private String uri;
    private String encoding;
    private String sampleHertz;
    private String languageCode;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public Results recognizeAudio(Audio audio)
    {
        Config config = new Config(encoding, sampleHertz, languageCode);
        RecognitionSpeechModelRequest request = new RecognitionSpeechModelRequest(config, audio);

        RestTemplate restTemplate = new RestTemplate();
        Results results = restTemplate.postForObject( uri, request, Results.class);

        return results;
    }
}
