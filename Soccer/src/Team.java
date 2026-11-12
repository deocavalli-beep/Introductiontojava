
public class Team {

    // Instance variables
    String teamName;
    int score;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.score = 0;
    }

    // Method to display team information
    public void displayTeam() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Goals: " + score);
    }
}
