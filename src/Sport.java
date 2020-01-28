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
}
