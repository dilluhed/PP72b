import java.util.Random;

public class Basketball extends Sport
{
    private String name;
    private String equipment;
    public Basketball(String name, String equipment)
    {
        super(name,equipment);
    }

    public String shoot()
    {
        if (Math.random() >= 0.5)
            return "Kobe!";
        else
            return "Airball!";
    }

    @Override
    public String play() {
        return "Bounce Bounce Bounce.";
    }
}
