abstract public class Sport
{
    protected String name;
    protected String equipment;
    protected int numOfTeams;

    public Sport(String name, String equipment, int numOfTeams)
    {
        this.name = name;
        this.equipment = equipment;
        this.numOfTeams = numOfTeams;
    }

    abstract public String play();

    public String getName()
    {
        return name;
    }

    public String getEquipment()
    {
        return equipment;
    }

    public String toString()
    {
        String output = "";
        output+= "Name: " + name;
        output+= "\nEquipment: " + equipment;

        return output;
    }
}
