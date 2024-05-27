package isp.TicketsApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {

    @Test
    public void TestTicket()
    {
        Ticket ticket = new Ticket(1, TicketCategory.CINEMA);
        assertEquals(1,ticket.getId());
        ticket.setId(2);
        assertEquals(2,ticket.getId());

        assertEquals(TicketCategory.CINEMA,ticket.getTicketCategory());
        ticket.setTicketCategory(TicketCategory.FOOTBALLMATCH);
        assertEquals(TicketCategory.FOOTBALLMATCH,ticket.getTicketCategory());
        assertEquals(25,ticket.getPrice());

        assertEquals("Ticket type: Football Match Ticket id: 2 price: 25",ticket.toString());


    }

    @Test
    public void TestUser()
    {
        User user =new User( "Ariana", 23);
        String actual=user.getName();
        assertEquals("Ariana",actual);

        float actualMoney= user.getMoney();
        assertEquals(23,actualMoney, 0.0f);
        user.setMoney(288);
        actualMoney= user.getMoney();
        assertEquals(288,actualMoney, 0.0f);


    }

    @Test
    public void TestOrganiser()
    {
        Organiser organiser = new Organiser("OrGG", 12);
        assertEquals("OrGG", organiser.getName());
        assertEquals(12,organiser.getId());
        assertEquals("name OrGG id 12", organiser.toString());
    }

    @Test
    public void TestUserApp()
    {
        Ticket ticket = new Ticket(1, TicketCategory.CINEMA);
        User user =new User( "Ariana", 23);
        UserApp userApp = new UserApp(ticket,user);
        assertEquals("Name:Ariana money: 23.0\n" +
                "Ticket type: Cinema City Ticket id: 1 price: 25",userApp.toString());

        Ticket ticket2 = new Ticket(2, TicketCategory.SPA);
        userApp.setTicket(ticket2);
        assertEquals("Name:Ariana money: 23.0\n" +
                "Ticket type: Spa Ticket id: 2 price: 40",userApp.toString());
    }
    @Test
    public void TestOrganiserApp()
    {
        User user =new User( "Ariana", 100);
        Ticket ticket = new Ticket(1,TicketCategory.CINEMA);
        UserApp userApp = new UserApp(ticket,user);
        Organiser organiser = new Organiser("IULIUS MALL", 1);
        OrganiserApp organiserApp = new OrganiserApp(organiser);
        assertEquals("IULIUS MALL",(organiserApp.getOrganiser()).getName());
        assertEquals(1,(organiserApp.getOrganiser()).getId());
        userApp.payTicket();
        organiserApp.payTicketOrgApp(ticket,userApp);
        assertEquals(75,user.getMoney(),0.0f);
        assertEquals("C",organiserApp.getCod());
        assertEquals(199,organiserApp.getSeatsCinema());

    }
}
