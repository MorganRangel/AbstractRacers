/**
 * Morgan and Beyonce
 * 3/5/24
 */
import java.util.ArrayList;
public class Race
{
    private ArrayList<AbstractRacer> racers;
    private int DISTANCE;

    public Race(int DISTANCE)
    {
        racers = new ArrayList<AbstractRacer>();
        this.DISTANCE = DISTANCE;
    }
    public void addRacer(AbstractRacer r)
    {
        racers.add(r);
    }
    public void removeRacer(AbstractRacer b)
    {
        racers.remove(b);
    }
    public ArrayList<AbstractRacer> getRacers()
    {
        return racers;
    }
    public int getDistance()
    {
        return DISTANCE;
    }
    public void update()
    {
        for(int i = 0; i < racers.size(); i++)
        {
            if(racers.get(i).getPosition() >= DISTANCE)
            {
                System.out.println("Winner is " + racers.get(i).getName());
            }
            else
            {
            for(int m = 0; m < racers.size(); m++)
                {
                racers.get(m).move();
                }
            }
        }   
 }
}