import java.util.ArrayList;

public class Main {
    public static ArrayList<UserStory> lsUserStory = new ArrayList<UserStory>();
    public static void main(String[] args) {

        System.out.println("Hello world!");
        fLoadUserStory();
        System.out.println(lsUserStory.toString());

        // Dann wollen wir die User erstellen.
        // TODO: Eingabeseite

        // TODO: Loop für
        // TODO: Ein Anzeigefenster wird geöffnet. (Abb 1x. im Pflichtenheft)
            // TODO: Der User hat eine Bewertung oder Frage abgegeben
         // Das wiederholt sich für jede Frage für jeden User

    }

    private static void fLoadUserStory(){
        for(int i = 0; i < 10; i++){
            String temp = "Userstory NR. "+i;
            lsUserStory.add(new UserStory(temp));
        }
    }
}