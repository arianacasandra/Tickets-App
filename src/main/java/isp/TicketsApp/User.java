package isp.TicketsApp;

public class User {

    private String name;
    private float money;

    public User( String name, float money)
    {

        this.name= name;
        this.money = money;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMoney(float money)
    {
        this.money = money;
    }

    public String getName()
    {
        return this.name;
    }
    public float getMoney()
    {
        return this.money;
    }
    @Override
    public String toString()
    {
        return "Name:" + getName() + " money: " + String.valueOf(getMoney());
    }
    public static void main(String[] args)
    {
        User user =new User( "Ariana", 23);
        System.out.println(user.getName());
        System.out.println(user.toString());
    }
}
