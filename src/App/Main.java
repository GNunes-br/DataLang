package App;

import java.util.*;
import Models.*;
import Listeners.DataLangErrorListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) {
        List<String> argsList = Arrays.asList(args);

        if (argsList.contains("-lex")) {
            LexicalAnalysis lex = new LexicalAnalysis();

            try {
                String fileContent = FileUtils.readFile(argsList.get(1));

                lex.run(fileContent);

                List<Token> tokens = lex.getTokens();

                List<String> errors = new DataLangErrorListener().getAllErrors();

                LexicalAnalysisResult result = new LexicalAnalysisResult(tokens, errors, 1);

                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                String json = objectMapper.writeValueAsString(result);

                System.out.print(json);

                Runtime.getRuntime().exit(0);
            } catch (Exception e) {
                LexicalAnalysisResult result = new LexicalAnalysisResult(null, null, 0);
                System.out.print(result);
            }
        }
    }
}
