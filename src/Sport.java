abstract public class Sport
{
    protected String name;
    protected String equipment;

    public Sport(String name, String equipment)
    {
        this.name = name;
        this.equipment = equipment;
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
        return "To play " + name + " I use " + equipment + ".";
    }
}
