package ee.emind.service;

import ee.emind.model.Audio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by aleksandr on 07/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeechRecognitionServiceTest {

    @Autowired
    private SpeechRecognitionService service;

    @Test
    public void testRecognitonConnect(){
    //    Audio audio = new Audio ();
    //    audio.setContent("AAQBXQVZFZm10IBAAAAABAAIARKwAABCxAgAEABAAZGF0YQCAAQCxC7ELkg6SDuQQ5BB1EXURBRAFEO4M7gyFCYU");
    //    System.out.println (service.recognizeAudio(audio));
    }
}
