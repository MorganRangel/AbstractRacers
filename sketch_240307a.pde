/**
 * Runs a race of Racers in the Processing environment
 */

 // Variables declared here
final int RACE_DISTANCE = 800;   // 100 px buffer before start and
                                 // after the finish
final int SCREENWIDTH = 1000;    // matches graphical window of 
                                 // size(1000, 800)
final int racerWidth = 100;            // racer width in pixels;
Race r;
/**
 * This method is run once before the draw() loop starts repeating.
 * Initialize the race variables, set up the screen...
 */
void setup()
{
  size(900, 700); 
    Hare h = new Hare("Hare");
    Tortoise t = new Tortoise("Tortoise");
    Kangaroo k = new Kangaroo("Kangaroo");
    r = new Race(100);
    r.addRacer(t);
    r.addRacer(h);
    r.addRacer(k);
    System.out.println(r.toString());
    while(r.isGoing())
    {
        t.move();
        k.move();
        h.move();
        System.out.println(r.toString());
    }
    System.out.println("Winner is " + r.getWinner());

}

void drawStartFinish()
{

    // Draws the start and finish lines
    

}

void drawRacers()
{
    for (AbstractRacer r : r.getRacers())
    {
       if (r instanceof Tortoise)
       {

            rect(r.getPosition(), 100, 10, 10);
            fill(100);

       }
       else if (r instanceof Hare)
       {

            rect(r.getPosition(), 90, 10, 10);
            fill(200);
       }
    }
}

void draw()
{
    background(255);                  // clear screen
    if (!r.isGoing())
    {
        r.update();
        drawStartFinish();
        drawRacers();
    }
    else
    {
        drawStartFinish();
        drawRacers();
        System.out.println("The race is over!");
        System.out.println("The winner is...." + r.getWinner());
        noLoop();
    }
}
