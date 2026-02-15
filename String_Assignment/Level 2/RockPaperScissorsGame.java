import java.util.Scanner;
public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {

            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(String[] results) 
        int userWins = 0;
        int computerWins = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals("User"))
                userWins++;
            else if (results[i].equals("Computer"))
                computerWins++;
        }
        double userPercent = (userWins * 100.0) / results.length;
        double compPercent = (computerWins * 100.0) / results.length;
        userPercent = Math.round(userPercent * 100.0) / 100.0;
        compPercent = Math.round(compPercent * 100.0) / 100.0;
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(compPercent);
        return stats;
    }
    public static void display(String[][] games, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" +
                    games[i][0] + "\t" +
                    games[i][1] + "\t\t" +
                    games[i][2]);
        }
        System.out.println("\n------ Statistics ------");
        System.out.println("Player\tWins\tWin %");
        System.out.println("-------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] games = new String[n][3];
        String[] results = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
            results[i] = winner;
        }
        String[][] stats = calculateStats(results);
        display(games, stats);
    }
}
