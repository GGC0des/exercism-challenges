import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Initialize two characters (Player 1 and Player 2)
        DnDCharacter player1 = new DnDCharacter();
        DnDCharacter player2 = new DnDCharacter();

        // Welcome message to simulate the start of the game
        System.out.println("Welcome to the DnD character creation!");
        System.out.println("Player 1 will play as Marcille and Player 2 will play as Laios.\n");

        // Print the dice rolls and ability scores for each player
        System.out.println("Rolling dice for abilities...\n");

        // Iterate through the abilities and roll dice in alternating turns
        for (String ability : player1.getAbilityNames()) {
            // Marcille rolls for the current ability
            List<Integer> rollsPlayer1 = player1.getDiceRolls().get(ability);
            int abilityScorePlayer1 = player1.getAbilities().get(ability);
            System.out.println("Marcille rolled " + rollsPlayer1 + " for " + ability + " (Score: " + abilityScorePlayer1 + ")");

            // Laios rolls for the current ability
            List<Integer> rollsPlayer2 = player2.getDiceRolls().get(ability);
            int abilityScorePlayer2 = player2.getAbilities().get(ability);
            System.out.println("Laios rolled " + rollsPlayer2 + " for " + ability + " (Score: " + abilityScorePlayer2 + ")\n");
        }

        // Print the results and compare players' abilities
        System.out.println("\n--- Battle Stats ---");
        comparePlayerStats(player1, player2);
    }

    private static void comparePlayerStats(DnDCharacter player1, DnDCharacter player2) {
        // Compare the two players' stats
        System.out.println("Comparing Player 1 (Marcille) and Player 2 (Laios)...");

        // Get stats from both players
        Map<String, Integer> player1Stats = player1.getAbilities();
        Map<String, Integer> player2Stats = player2.getAbilities();

        // Compare each ability score and highlight strengths and weaknesses
        for (String ability : player1Stats.keySet()) {
            int player1Score = player1Stats.get(ability);
            int player2Score = player2Stats.get(ability);

            System.out.println("\nComparing " + ability + ":");
            System.out.println("Marcille: " + player1Score + " vs Laios: " + player2Score);

            if (player1Score > player2Score) {
                System.out.println("Marcille is stronger in " + ability + "!");
            } else if (player1Score < player2Score) {
                System.out.println("Laios is stronger in " + ability + "!");
            } else {
                System.out.println("Both players have equal strength in " + ability + ".");
            }
        }

        // Analyze overall strengths and weaknesses
        System.out.println("\n--- Summary ---");
        summarizePlayerStrengths(player1, player2);
    }

    private static void summarizePlayerStrengths(DnDCharacter player1, DnDCharacter player2) {
        int player1Strength = player1.getAbilities().get("Strength");
        int player2Strength = player2.getAbilities().get("Strength");

        int player1Constitution = player1.getAbilities().get("Constitution");
        int player2Constitution = player2.getAbilities().get("Constitution");

        System.out.println("\n--- Player Strengths and Weaknesses ---");

        // Strength comparison
        if (player1Strength > player2Strength) {
            System.out.println("Marcille is the stronger warrior (Strength: " + player1Strength + ")");
        } else if (player1Strength < player2Strength) {
            System.out.println("Laios is the stronger warrior (Strength: " + player2Strength + ")");
        } else {
            System.out.println("Both players have equal strength in combat.");
        }

        // Constitution comparison (for health and endurance)
        if (player1Constitution > player2Constitution) {
            System.out.println("Marcille has better endurance (Constitution: " + player1Constitution + ")");
        } else if (player1Constitution < player2Constitution) {
            System.out.println("Laios has better endurance (Constitution: " + player2Constitution + ")");
        } else {
            System.out.println("Both players have equal endurance.");
        }

        // Hitpoints comparison
        System.out.println("\n--- Hitpoints Comparison ---");
        System.out.println("Marcille's Hitpoints: " + player1.getHitpoints());
        System.out.println("Laios' Hitpoints: " + player2.getHitpoints());

        if (player1.getHitpoints() > player2.getHitpoints()) {
            System.out.println("Marcille has more hitpoints and can endure longer in battle!");
        } else if (player1.getHitpoints() < player2.getHitpoints()) {
            System.out.println("Laios has more hitpoints and can endure longer in battle!");
        } else {
            System.out.println("Both players have equal hitpoints.");
        }

        // Summary conclusion
        System.out.println("\nTeam dynamics:");
        if (player1Strength > player2Strength) {
            System.out.println("Marcille is the powerhouse in combat, while Laios can focus on strategic play.");
        } else {
            System.out.println("Laios leads the charge with stronger combat skills, while Marcille provides powerful support.");
        }
    }
}
