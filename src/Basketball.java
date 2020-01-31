import java.util.Random;

public class Basketball extends Sport
{
    private int quarterTime;
    private boolean isHalfCourt;
    public Basketball(String name, String equipment, int numOfTeams, int quarterTime, boolean isHalfCourt)
    {
        super(name,equipment, numOfTeams);
        this.quarterTime = quarterTime;
        this.isHalfCourt = isHalfCourt;
    }

    public void shoot()
    {
        if (Math.random() >= 0.5)
            System.out.println("Kobe!");
        else
            System.out.println("Airball!");
    }

    @Override
    public String play() {
        return "Bounce Bounce Bounce.";
    }

    public String toString()
    {
        String output = "";
        output+=super.toString();
        output+="\nTime Per Quarter: " + quarterTime + " min.";
        output+="\nHalf Court: " + isHalfCourt;
        return output;
    }
}
