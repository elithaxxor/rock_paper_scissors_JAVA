import java.util.Random;
import java.util.Scanner;


/* == checks if both objects point to the same memory location whereas . equals() evaluates to the comparison of values in the objects.
 */
public class RockPaperScissors {
    public static void main (String[] args){
        System.out.println("[Simple ROCK-PAPER-SCISSORS Game]");

        // [OBJs]
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // [VARs] --> available moves && comp randomly generated move.
            String[] rps_moves = {"r", "p", "s"};
            String machine_play = rps_moves[new Random().nextInt(rps_moves.length)]; // retrieves random index
            String human_play;

            while (true) {
                System.out.println("[NEXT MOVE]--> (r)rock; (p)paper; (s)scissors");
                human_play = scanner.nextLine();
                if (human_play.equals("r") || human_play.equals("p") || human_play.equals("s")) {
                    break;
                }
                System.out.println("Invalid Input, enter: [(r)rock; (p)paper; (s)scissors] ");
            }

            // [PRINT]
            System.out.println("[MACHINE] " + machine_play);
            System.out.println("[HUMAN] " + human_play);


            // [LOGIC] 1. both choices are equal. 2]. r -> p 3.] p -> s
            if (human_play.equals(machine_play)) {
                System.out.println("Tied Game--> Both Chose " + human_play);

            } else if (human_play.equals("r")) {
                if (machine_play.equals("p")) {
                    System.out.println("The Human Loses [H M]" + human_play + machine_play);
                } else if (machine_play.equals("s")) {
                    System.out.println("The Human Wins [H M]" + human_play + machine_play);
                }
            } else if (human_play.equals("p")) {
                if (machine_play.equals("s")) {
                    System.out.println("The Human Loses [H M]" + human_play + machine_play);
                }
            } else if (human_play.equals("r")) {
                if (machine_play.equals("s")) {
                    System.out.println("The Human W [H M]" + human_play + machine_play);
                }
            }
            System.out.println("Play Again? [y/n]");
            String restart = scanner.nextLine();
            if (restart.equals("n")){
                System.out.println("OKAY.. ENDING GAME!");
                scanner.close();
                break;
            }else{
                continue;
            }
        }
        // [CLOSE OBJs]

    }
}
