
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // test your method here
        

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveValues = numbers.stream()
            .filter(n -> n > 0)
            .collect(Collectors.toCollection(ArrayList::new));
        return positiveValues;
    }

}
