package ee.emind.controller;

import ee.emind.model.Audio;
import ee.emind.service.WitAiService;
import lombok.Setter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by aleksandr on 07/05/2017.
 */
@RestController
public class ReceiveAudioController {

    @Autowired
    @Setter
    private WitAiService service;

    private static final Logger logger = LogManager.getLogger(ReceiveAudioController.class);

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public @ResponseBody String saveAudio(@RequestBody Audio data, HttpServletRequest request) throws IOException {
        logger.info("Request from:" + request.getRemoteAddr());
        return service.processAudio(data);
    }

}
