/**
 * The Tortoise class keeps track of the Tortoise and manages the way it moves
 * @Beyonce Maldonado
 * @3/4/2024
 */

public class Tortoise extends Racer
{
    private int position; 

    public Tortoise(String name)
    {
        super(name);
        position = 0;
    }

    /**
     * moves the tortoise
     */

    public void move()
    {
        setPosition(getPosition() + 1)
    }
}