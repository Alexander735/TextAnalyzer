package CommentsAnalyzerTask;
import java.util.Arrays;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            getLabel();
        }

        return Label.OK;
    }

    protected Label getLabel() {
        return Label.TOO_LONG;
    }
}
