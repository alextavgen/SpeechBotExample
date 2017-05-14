package ee.emind.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

/**
 * Created by aleksandr on 07/05/2017.
 * models configuration for Google Speech API Rest
 * "config": {
 *"encoding": "LINEAR16",
 *"sampleRateHertz": 16000,
 *"languageCode": "en-US"
 *}
 *
 *
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Value
public class Config {
    private String encoding;
    private String sampleRateHertz;
    private String languageCode;

}
