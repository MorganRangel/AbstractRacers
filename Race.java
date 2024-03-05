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
            for(int m = 0; m < racers.size(); m++)
                {
                racers.get(m).move();
                }
        }   
    }
    public boolean isOver()
    {
        for(int i = 0; i < racers.size(); i++)
        {
        if(racers.get(i).getPosition() >= DISTANCE)
            
            return true;
        else
            return false;
        }
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
    }
    public String toString()
    {
        for(int i = 0; i < racers.size(); i++)
        {
        String result =  super.toString() + "[Name=" + racers.get(i).getName() + ", position=" + racers.get(i).getPosition()  + "]";
        }
        return result;
    }
}