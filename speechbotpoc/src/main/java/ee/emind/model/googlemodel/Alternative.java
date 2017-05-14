package ee.emind.model.googlemodel;

/**
 * Created by aleksandr on 07/05/2017.
 */
public class Alternative {
    private String transcript;
    private Double confidence;

    public Alternative() {
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    @Override
    public String toString() {
        return "Alternative{" +
                "transcript='" + transcript + '\'' +
                ", confidence=" + confidence +
                '}';
    }
}
