
public class Game {

    // Static variable
    static String sportName = "Soccer";

    // Static variable to count games
    static int gameCount = 0;

    // Constructor
    public Game() {
        gameCount++;
    }

    // Method to update team score
    public void addGoal(Team team, int goals) {
        team.score = team.score + goals;
    }

    // Static method
    public static void displaySport() {
        System.out.println("Sport: " + sportName);
    }

    // Method to determine winner
    public void determineWinner(Team team1, Team team2) {

        if (team1.score > team2.score) {
            System.out.println("Winner: " + team1.teamName);
        }
        else if (team2.score > team1.score) {
            System.out.println("Winner: " + team2.teamName);
        }
        else {
            System.out.println("Result: The match is a Draw!");
        }
    }
}
