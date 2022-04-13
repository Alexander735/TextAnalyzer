package CommentsAnalyzerTask;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract Label processText(String text);

    protected abstract String getKeywords();

    abstract protected Label getLabel();
}
