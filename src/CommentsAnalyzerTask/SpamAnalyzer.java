package CommentsAnalyzerTask;
import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String [] keywords;

    public SpamAnalyzer(String [] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        for (String i : keywords) {
            if (text.contains(i)) {
                getLabel();
            }
        }

        return Label.OK;
    }

    @Override
    protected String getKeywords() {
        return Arrays.toString(keywords);
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
