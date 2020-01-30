public class TrackAndField extends Sport
{
    public TrackAndField(String name, String equipment)
    {
        super(name,equipment);
    }

    public void onYourMarks()
    {
        if (Math.random() >= 0.5)
            System.out.println("Go!");
        else
            System.out.println("False Start!");
    }

    @Override
    public String play() {
        return "*Bang* Thud. Thud. Thud.";
    }

}
