package level2;
import java.util.*;

public class RockPaperScissors {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of games: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        String[][] gameResults = new String[n][3];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Round " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
	            String userChoice = scanner.nextLine().toLowerCase();
	            String computerChoice = getComputerChoice();
	            String winner = getWinner(userChoice, computerChoice);

	            gameResults[i][0] = userChoice;
	            gameResults[i][1] = computerChoice;
	            gameResults[i][2] = winner;
	        }
	        String[][] stats = calculateStats(gameResults);
	        displayResults(gameResults, stats);
	    }
	
	 public static String[][] calculateStats(String[][] results) {
	        int userWins = 0;
	        int compWins = 0;
	        int draws = 0;
	        int total = results.length;

	        for (String[] row : results) {
	            switch (row[2]) {
	                case "User" -> userWins++;
	                case "Computer" -> compWins++;
	                case "Draw" -> draws++;
	            }
	        }

	        String[][] stats = {
	            {"Player Wins", String.valueOf(userWins)},
	            {"Computer Wins", String.valueOf(compWins)},
	            {"Draws", String.valueOf(draws)},
	            {"Player Win %", String.format("%.2f%%", (userWins * 100.0 / total))},
	            {"Computer Win %", String.format("%.2f%%", (compWins * 100.0 / total))}
	        };

	        return stats;
	    }
	 public static String getComputerChoice() {
	        int rand = (int)(Math.random() * 3); // 0, 1, or 2
	        return switch (rand) {
	            case 0 -> "rock";
	            case 1 -> "paper";
	            default -> "scissors";
	        };
	    }
	 
	 public static String getWinner(String user, String computer) {
	        if (user.equals(computer)) return "Draw";

	        return switch (user) {
	            case "rock" -> computer.equals("scissors") ? "User" : "Computer";
	            case "paper" -> computer.equals("rock") ? "User" : "Computer";
	            case "scissors" -> computer.equals("paper") ? "User" : "Computer";
	            default -> "Invalid";
	        };
	    }
	 public static void displayResults(String[][] results, String[][] stats) {
	        System.out.println("\nGame\tUser\tComputer\tResult");
	        System.out.println();
	        for (int i = 0; i < results.length; i++) {
	            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
	        }

	        System.out.println("\nGame Stats:");
	        for (String[] stat : stats) {
	            System.out.println(stat[0] + ": " + stat[1]);
	        }
	    }

}
