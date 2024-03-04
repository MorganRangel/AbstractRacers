public class Hare extends AbstractRacer
{
    public Hare(String name)
    {
        super(name);
    }
    public void move()
    {
        int num1 = (int)(Math.random() * 2);
        int num2 = (int)(Math.random() * 5) + 1;
        if (num1 == 0)
        {
            setPosition(getPosition()+num2);
        }
        else
        {
            setPosition(getPosition()+0);
        }
    }
}