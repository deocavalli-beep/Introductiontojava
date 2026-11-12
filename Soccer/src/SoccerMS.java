
import java.util.Scanner;

public class SoccerMS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display sport name using static method
        Game.displaySport();

        // Collect team names
        System.out.print("Enter First Team Name: ");
        String name1 = input.nextLine();

        System.out.print("Enter Second Team Name: ");
        String name2 = input.nextLine();

        // Create team objects
        Team team1 = new Team(name1);
        Team team2 = new Team(name2);

        // Create game object
        Game game = new Game();

        // Collect scores using a loop
        for (int i = 1; i <= 2; i++) {

            if (i == 1) {
                System.out.print("Enter goals scored by "
                        + team1.teamName + ": ");

                int goals = input.nextInt();

                game.addGoal(team1, goals);
            }
            else {
                System.out.print("Enter goals scored by "
                        + team2.teamName + ": ");

                int goals = input.nextInt();

                game.addGoal(team2, goals);
            }
        }

        // Display final scoreboard
        System.out.println("\n===== FINAL SOCCER SCOREBOARD =====");

        team1.displayTeam();
        System.out.println("----------------------");

        team2.displayTeam();

        // Determine winner
        System.out.println("----------------------");
        game.determineWinner(team1, team2);

        // Display number of games
        System.out.println("Games Played: " + Game.gameCount);

        input.close();
    }
}
