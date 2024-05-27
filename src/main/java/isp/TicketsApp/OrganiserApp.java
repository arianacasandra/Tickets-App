package isp.TicketsApp;

public class OrganiserApp implements TicketsManager,Payment {
    private Organiser organiser;
    private int seatsCinema=200;
    private int seatsSpa=100;
    private int seatsTheatre=250;
    private int seatsMatch=100;
    private String cod="unavailable";
    private String checkStatus="unchecked";

    public OrganiserApp(Organiser organiser){
        this.organiser = organiser;
    }
    @Override
    public void payTicket(){};
    @Override
    public void payTicketOrgApp( Ticket ticket, UserApp userApp)
    {

        if(organiser.getId()== ticket.getId() && userApp.isPayment()==true )
        {

            System.out.println("Your selection is the same as the place your ticket belongs...");
            switch (ticket.getId())
            {
                case 1:int x=getSeatsCinema()-1;
                       setSeatsCinema(x);
                       cod=generateTicket();
                       break;
                case 2: setSeatsSpa(getSeatsSpa()-1);
                        cod=generateTicket();
                        break;
                case 3: setSeatsTheatre(getSeatsTheatre()-1);
                        cod=generateTicket();
                        break;
                case 4: setSeatsMatch(getSeatsMatch()-1);;
                        cod=generateTicket();
                        break;

                default: break;

            }
            generateTicket();
            validateTicket();
            scanTicket();

        }
        else {
               System.out.println("You didn't generate the corect ticket or don't have enough money");
            }
    }

    public String getCod() {
        return cod;
    }
    public void setSeatsCinema(int seatsCinema)
    {
        this.seatsCinema=seatsCinema;
    }
    public void setSeatsMatch(int seatsMatch)
    {
        this.seatsMatch=seatsMatch;
    }
    public void setSeatsTheatre(int seatsTheatre)
    {
        this.seatsTheatre = seatsTheatre;

    }
    public void setSeatsSpa(int seatsSpa)
    {
        this.seatsSpa = seatsSpa;
    }
    public int getSeatsCinema(){
       return this.seatsCinema;
    }

    public int getSeatsMatch() {
        return seatsMatch;
    }

    public int getSeatsTheatre() {
        return seatsTheatre;
    }


    public int getSeatsSpa() {
        return seatsSpa;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }
    public String getCheckStatus()
    {
        return this.checkStatus;

    }
    public Organiser getOrganiser() {
        return organiser;
    }

    @Override
    public void validateTicket() {
        if(getCod() == "C" || getCod() == "M" || getCod()=="S" || getCod()=="T")
            checkIn();
    }

    @Override
    public String generateTicket() {
        switch(organiser.getId()) {
            case 1:
                return "C";
            case 2:
                return "S";
            case 3:
                return "T";
            case 4:
                return "F";
        }
     return "unavailable";
    }

    public void setOrganiser(Organiser organiser) {
        this.organiser = organiser;
    }

    public  void checkIn()
    {

        setCheckStatus("checked");
        System.out.println("Your ticket is checkedIn");
    }
    public void scanTicket()
    {
        if(getCheckStatus()=="checked")
            System.out.println("You completed the procedure");
        else System.out.println("Something went wrong in the system");
    }

    public static void main(String[] args)
    {
        User user =new User( "Ariana", 23);
        Ticket ticket = new Ticket(2,TicketCategory.SPA);
        UserApp userApp = new UserApp(ticket,user);
        Organiser organiser = new Organiser("IULIUS MALL", 2);
        OrganiserApp organiserApp = new OrganiserApp(organiser);
        System.out.println((organiserApp.getOrganiser()).getName());
        System.out.println((organiserApp.getOrganiser()).getId());
        userApp.payTicket();
        organiserApp.payTicketOrgApp(ticket,userApp);

        System.out.println(organiserApp.getCod());

        System.out.println(user.getMoney());

        System.out.println(organiserApp.getSeatsSpa());


    }
}
