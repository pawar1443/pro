package pro.data_processing;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class processing {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("pro/data_processing/data.csv"))) {
            lines.skip(1) // skip header
                 .forEach(System.out::println); // print remaining lines
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
