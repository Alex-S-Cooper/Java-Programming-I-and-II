
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String firstName = scanner.nextLine();
            if (firstName.equals("")) {
                break;
            }
            String lastName = scanner.nextLine();
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        for (PersonalInformation pi: infoCollection) {
            System.out.println("First name: " + pi.getFirstName());
            System.out.println("Last name: " + pi.getLastName());
            // System.out.println("Indentification number: " + pi.getIdentificationNumber());
        }
        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}
