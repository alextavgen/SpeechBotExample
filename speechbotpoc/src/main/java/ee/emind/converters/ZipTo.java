package ee.emind.converters;

import ee.emind.model.WitAppLanguage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by aleksandr on 07/05/2017.
 */
public class ZipTo {
    public static List<WitAppLanguage> zipToListWitAiLanguages(String[] keys, String[] values) {
        return IntStream.range(0, keys.length).boxed()
                .map(i -> (new  WitAppLanguage(keys[i], values[i])))
                .collect(Collectors.toList());
    }
}
