import java.util.Random;

public class Basketball extends Sport
{
    private String name;
    private String equipment;
    public Basketball(String name, String equipment)
    {
        super(name,equipment);
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

}
