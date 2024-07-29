import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
public class FileStatisticsAlternate {
    public static void main(String[] args) {
        Path filePath = Paths.get("example.txt");
        try {
            String content = Files.readString(filePath);
            String[] lines = content.split("\n");
            long lineCount = lines.length;
            long charCount = content.length();
            long wordCount = Arrays.stream(content.split("\\s+"))
                .filter(word -> !word.isEmpty()) 
                .count();
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
