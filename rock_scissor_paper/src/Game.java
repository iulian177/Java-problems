import java.util.Scanner;

public class Game {
    private int nrElements;
    private int player1;
    private int player2;
    private static int p1_points;
    private static int p2_points;
    public void chooseNrElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many elements are in the game?");
        nrElements = scanner.nextInt();
    }
    public void chooseElements() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("player 1, choose an element from 1 to " + nrElements);
        player1 = scanner.nextInt();
        System.out.println("player 2, choose an element from 1 to " + nrElements);
        player2 = scanner.nextInt();
        //scanner.close();
    }
    public void setWinner() {

        if ((player2 == (player1 + 1))) {
            System.out.println("Player2 wins");
            p2_points += 1;
        } else if ((player2 == 1) && (player1 == nrElements)){
            System.out.println("Player2 wins");
            p2_points += 1;
        } else if (player1 == player2) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Player1 wins");
            p1_points += 1;
        }

    }

    public static int getP1_points() {
        return p1_points;
    }

    public static int getP2_points() {
        return p2_points;
    }
    public void getWinner() {
        if (p1_points > p2_points) {
            System.out.println("player 1 has more points");
        } else if (p1_points == p2_points) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("player 2 has more points");
        }
    }
}
