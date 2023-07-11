
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(7, 40);
        
        Money difference = a.minus(b);
        
        System.out.println(difference);
    }
}
