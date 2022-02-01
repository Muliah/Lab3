import java.util.Scanner;
public class Game {
    private static Scanner sc = new Scanner(System.in);
    static boolean game = true;
    private static Player player;

        public static void main(String[] args) {

            // Welcome screen
            System.out.println();
            System.out.println("************************");
            System.out.println("* Welcome to the Game! *");
            System.out.println("************************");
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            player = init(name);
            System.out.println();

        //while game is true, run the menu
            while(game){
                meny();
            }

        }

    /** Init method, creates player */
    public static Player init(String name) {
        return new Player(name);
    }

    /** Meny choice */
    static void meny() {

        byte Choice;
        boolean mainMenuLoop = true;

        do {
            System.out.println("1. Go adventuring");
            System.out.println("2. Show details about your character");
            System.out.println("3. Exit");
            System.out.print("> ");
            Choice = parseDigit(sc.nextLine(), (byte) -1);
            System.out.println();

            switch (Choice) {
                case 1:
                    Adventure.GoAdventure(player);
                    break;
                case 2:
                    Player.toString(player);
                    break;
                case 3:
                    mainMenuLoop = false;
                    break;
                default:
                    System.out.println("Please make a valid selection.\n");
            }
        } while (mainMenuLoop);
        game = false;

        System.out.println("Bye!");
    }

    /** Parsing is to read the value of one object to convert it to another type (string to number)
     * Using it in meny methood for meny selection **/
    private static byte parseDigit(String subject, byte defaultValue) {

        return (subject.matches("^\\d$") ? Byte.parseByte(subject) : defaultValue);
    }

}
