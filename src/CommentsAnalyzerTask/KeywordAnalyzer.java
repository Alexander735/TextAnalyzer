package CommentsAnalyzerTask;
import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    private String [] keywords;

    @Override
    public Label processText(String text) {
        return null;
    }

    protected abstract String getKeywords();

    protected abstract Label getLabel();
}
