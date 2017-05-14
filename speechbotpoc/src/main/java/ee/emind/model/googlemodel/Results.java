package ee.emind.model.googlemodel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aleksandr on 07/05/2017.
 */
public class Results {
    private List<Alternatives> alternatives;

    public Results() {
    }

    public List<Alternatives> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(List<Alternatives> alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public String toString() {
        return "Results{" +
                "alternatives=" + alternatives.toString() +
                '}';
    }
}
