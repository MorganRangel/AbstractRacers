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
                racers.get(i).move();
        }   
    }
    public boolean isGoing()
    {
        for(int i = 0; i < racers.size(); i++)
        {
        if(racers.get(i).getPosition() >= DISTANCE)
            
            return false;
        }
        return true;
    }
    public String getWinner()
    {
        for(int i = 0; i < racers.size(); i++)
        {
        if(racers.get(i).getPosition() >= DISTANCE)
        {
            return racers.get(i).getName();
        }
        }
        return null;
    }
    public String toString()
    {
        String result = "";
        for(int i = 0; i < racers.size(); i++)
        {
        result +=  super.toString() + "[Name=" + racers.get(i).getName() + ", position=" 
        + racers.get(i).getPosition()  + "]";
        result += "\n";

        }
        return result;
    }
}
