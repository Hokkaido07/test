import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParse {
    public boolean isWordInFile(String word, String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                if (line.equalsIgnoreCase(word)) {
                    reader.close();
                    return true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
