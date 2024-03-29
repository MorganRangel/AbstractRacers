/**
 * Manages the Racer class
 */
public class RacerRunner 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Racer Runner!");
        Hare h = new Hare("Hare");
        Tortoise t = new Tortoise("Tortoise");
        Kangaroo k = new Kangaroo("Kangaroo");
        Race race = new Race(100);
        race.addRacer(t);
        race.addRacer(h);
        race.addRacer(k);
        System.out.println(race.toString());
        while(race.isGoing())
        {
            t.move();
            k.move();
            h.move();
            System.out.println(race.toString());
        }
            System.out.println("Winner is " + race.getWinner());
    }
}