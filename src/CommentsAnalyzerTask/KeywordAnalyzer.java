package CommentsAnalyzerTask;

import java.util.Arrays;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    private String [] keywords;

    public Label processText(String text) {
        for (String i : keywords) {
            if (text.contains(i)) {
                getLabel();
            }
        }

        return Label.OK;
    }

    protected String getKeywords() {
        return Arrays.toString(keywords);
    }

    abstract protected Label getLabel();
}
