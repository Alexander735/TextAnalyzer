package CommentsAnalyzerTask;
import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String [] keywords;

    public SpamAnalyzer(String [] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
