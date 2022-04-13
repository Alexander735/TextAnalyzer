package CommentsAnalyzerTask;
import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String [] keywords = new String [] {":(" , "=(", ":|"};

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
