
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                boolean isHome = false;
                boolean isVisit = false;
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String parts[] = line.split(",");
                String home = parts[0];
                String visit = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);
                if (team.equals(home)) {
                    isHome = true;
                    if (homePoints > visitPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(visit)) {
                    isVisit = true;
                    if (visitPoints > homePoints) { 
                        wins++;
                    } else {
                        losses++;
                    }
                } else {
                    continue;
                }
                if (isHome || isVisit) {
                    gameCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
