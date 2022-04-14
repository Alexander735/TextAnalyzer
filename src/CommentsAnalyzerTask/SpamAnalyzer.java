package CommentsAnalyzerTask;
import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
        label = Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
