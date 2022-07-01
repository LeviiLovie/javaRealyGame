import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainStart();
    }
    
    static void MainStart() {
        Start start = new Start();
        start.Hello();
    }
}

class Data {
    String language = "ENG";
    // int apizode = 1;
}

class ENGGame {
    public void main(int apisode) {
        if (apisode == 1) {apisodeOne();}
    }

    static void apisodeOne() {
        System.out.println("Apizode 1!");
    }
}

/* 
 * class RUSGame {
 *    // TO DO rus game
 *}
 */

class Start {
    public void Hello() {
        Scanner userIn = new Scanner(System.in);
        Data data = new Data();
        
        System.out.println("Hello, in the limun game!" + "\n");
        System.out.println("P.S. Any your select it's small letter and in input time, if selected has a number (1. *, 2. *, 3. *) write a number" + "\n");
        System.out.println("Plese select a language");
        System.out.println("ENG" + "\n" + "RUS" + " P.S. In this time is development, if you select this language - language will ENG");
        String language = userIn.nextLine();
        
        if (language != "eng") {
            data.language = "eng";
        } else {
            data.language = language;
        }
        
        System.out.println(data.language);
        userIn.close();
    }
    
    public void StartGame() {
        Scanner userIn = new Scanner(System.in);
        Data data = new Data();

        if (data.language == "eng") {
            System.out.println("Plese select a apisode");
            System.out.println("1. Vilage" + "\n" + "2. City" + " P.S. In this time is development, if you select this apizod - apizode will 1. Vilage");
            // data.apizode = userIn.nextInt();
            int apizode = userIn.nextInt();

            ENGGame engGame = new ENGGame();
            engGame.main(apizode);
        }
        userIn.close();
    }
}
