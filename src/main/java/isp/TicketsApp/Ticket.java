package isp.TicketsApp;

import java.awt.*;

public class Ticket {
    int id;

    int price;
    TicketCategory ticketCategory;
    public Ticket(int id, TicketCategory ticketCategory)
    {
        this.id = id;
        this.ticketCategory = ticketCategory;
        switch(id)
        {
            case 1: this.price = 25;
                    break;
            case 2: this.price = 40;
                    break;
            case 3: this.price = 35;
                    break;
            case 4: this.price = 15;
                    break;
            default: break;
        }


    }

    public int getPrice() {
        return price;
    }

    public int getId()
    {
       return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setTicketCategory(TicketCategory ticketCategory)
    {
        this.ticketCategory = ticketCategory;
    }
    public TicketCategory getTicketCategory()
    {
        return this.ticketCategory;
    }
    @Override
    public String toString() {
        return "Ticket type: " + getTicketCategory()+" id: "+String.valueOf(getId()) +" price: "+ String.valueOf(getPrice());
    }
    public static void main(String[] args)
    {
        Ticket ticket = new Ticket(1, TicketCategory.CINEMA);
        System.out.println("Ticket id " + ticket.getId());
        ticket.setId(2);
        System.out.println("Ticket id " + ticket.getId());
        System.out.println(ticket.getTicketCategory());
        ticket.setTicketCategory(TicketCategory.FOOTBALLMATCH);
        System.out.println("Ticket type "+ticket.getTicketCategory());
        System.out.println("Price "+ticket.getPrice());
        System.out.println(ticket.toString());
    }

}
