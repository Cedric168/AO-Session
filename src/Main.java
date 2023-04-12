import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Club fcb = createClub("FC Bayern München", "München");
        Player fcbCaptain = createCaptain("Manuel", "Neuer");
        Coach fcbCoach = createCoach("Thomas", "Tuchel", "28912428581348");

        var result = new HashMap<Club, Coach>();
        result.put(fcb, fcbCoach);
    }

    private static Club createClub(String name, String city) {
        Club club = new Club();
        club.setName(name);
        club.setCity(city);
        return club;
    }

    private static Player createCaptain(String firstname, String lastname) {
        Player player = new Player();
        player.setFirstname(firstname);
        player.setLastname(lastname);
        return player;
    }

    private static Coach createCoach(String firstname, String lastname, String idnr) {
        Coach coach = new Coach();
        coach.setFirstname(firstname);
        coach.setSurname(lastname);
        coach.setIdNr(idnr);
        return coach;
    }

    private static void print(String text) {
        System.out.println(text);
    }
}