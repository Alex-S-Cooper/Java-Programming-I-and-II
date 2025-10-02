
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, String> myHashMap = (new HashMap<>());
        myHashMap.add("Italy", "Rome");
        myHashMap.add("France", "Paris");
        myHashMap.add("England", "London");
        System.out.println(myHashMap.get("Italy"));

    }

}
