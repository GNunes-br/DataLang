package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
    public static String readFile(String path) throws Exception {
        try {
            StringBuilder content = new StringBuilder();
            FileReader file = new FileReader(path);
            BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();

            while (line != null) {
                content.append(line);
                content.append(System.lineSeparator());
                line = reader.readLine();
            }

            reader.close();
            file.close();

            return content.toString();
        } catch (IOException e) {
            throw new Exception("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
