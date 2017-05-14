package ee.emind.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by aleksandr on 07/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class RecognitionSpeechModelRequest {
    private Config config;
    private Audio audio;

}
