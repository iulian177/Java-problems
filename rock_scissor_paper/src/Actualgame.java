import java.util.Scanner;

public class Actualgame{
        public void starts() {

                Game game = new Game();
                Scanner scanner = new Scanner(System.in);
                int x = 1;
                game.chooseNrElements();
                while (x == 1) {
                        game.chooseElements();
                        game.setWinner();
                        System.out.println("Introduce nr 1 pentru a continua");
                        x = scanner.nextInt();
                }

                game.getWinner();
        }

}

