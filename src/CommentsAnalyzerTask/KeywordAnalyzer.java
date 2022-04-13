package CommentsAnalyzerTask;
import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    private String [] keywords;

    public abstract Label processText(String text);

    protected abstract String getKeywords();

    protected abstract Label getLabel();
}
