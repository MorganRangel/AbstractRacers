/**
 * The Tortoise class keeps track of the Tortoise and manages the way it moves
 * @Beyonce Maldonado
 * @3/4/2024
 */

public class Tortoise extends AbstractRacer
{
   

    public Tortoise(String name)
    {
        super(name);
       
    }

    /**
     * moves the tortoise
     */

    public void move()
    {
        setPosition(getPosition() + 1);
    }
}