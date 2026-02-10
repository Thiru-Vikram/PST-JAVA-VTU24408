package Week3;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (a.score != b.score) {
            return b.score - a.score; // descending (higher score first)
        }
        // If scores are equal, compare by name alphabetically
        return a.name.compareTo(b.name); // ascending (alphabetical)
    }
}

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(players, checker);

        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}
