
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(",")) 
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]);})
                    .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].replace("(%)", "").trim() + ", " + p[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
