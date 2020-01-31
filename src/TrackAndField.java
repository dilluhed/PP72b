public class TrackAndField extends Sport
{
    private String event;
    private boolean isRelay;
    private int runnersCheckedIn;
    public TrackAndField(String name, String equipment, int numOfTeams, String event, boolean isRelay, int runnersCheckedIn)
    {
        super(name,equipment,numOfTeams);
        this.event = event;
        this.isRelay = isRelay;
        this.runnersCheckedIn = runnersCheckedIn;
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

    public String toString()
    {
        String output = "";
        output+=super.toString();
        output+="\nEvent: " + event;
        output+="\nRelay: " + isRelay;
        output+="\nRunners Lined Up: " + runnersCheckedIn;
        return output;
    }
}
