package isp.TicketsApp;

public class Organiser {
    private int id;
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public Organiser(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString()
    {
        return "name "+getName()+" id "+String.valueOf(getId());
    }
    public static void main(String[] args)
    {
        Organiser organiser = new Organiser("OrGG", 12);
        System.out.println(organiser.getId());
        System.out.println(organiser.toString());

    }
}
