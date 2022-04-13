package CommentsAnalyzerTask;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer i : analyzers) {
            if (!i.processText(text).equals(Label.OK)) {
                return i.processText(text);
            }
        }

        return Label.OK;
    }
}
