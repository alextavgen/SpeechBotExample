package ee.emind.controller;

import ee.emind.converters.ZipTo;
import ee.emind.model.WitAppLanguage;
import lombok.Setter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by aleksandr on 07/05/2017.
 */
@RestController
@ConfigurationProperties(prefix="witai.app")
public class WitLanguageCodesController {
    @Setter private String[] codes;
    @Setter private String[] languages;


    private static final Logger logger = LogManager.getLogger(WitLanguageCodesController.class);

    @RequestMapping(value="/wit/languages", method= RequestMethod.GET)
    public @ResponseBody
    List<WitAppLanguage> getLanguages (){
        return ZipTo.zipToListWitAiLanguages(codes, languages);
    }

    @RequestMapping(value = "/wit/language/{language}", method = RequestMethod.PUT)
    public @ResponseBody String updateStudent(@PathVariable String language){
        logger.info("Language selected: " + language);
        return "ok";
    }
}
