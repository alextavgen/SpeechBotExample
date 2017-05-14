package ee.emind.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Value;

/**
 * Created by aleksandr on 07/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Value
public class WitAppLanguage {
    private String code;
    private String language;
}
