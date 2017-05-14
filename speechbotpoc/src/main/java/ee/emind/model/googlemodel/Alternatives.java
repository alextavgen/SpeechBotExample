package ee.emind.model.googlemodel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aleksandr on 07/05/2017.
 */
public class Alternatives {
    private List<Alternative> alternatives;

    public Alternatives() {
    }

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<Alternative>alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public String toString() {
        return "Alternatives{" +
                "alternatives=" + alternatives +
                '}';
    }
}
