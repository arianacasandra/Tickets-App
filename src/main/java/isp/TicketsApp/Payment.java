package isp.TicketsApp;

public interface Payment{
    void payTicket();
    void payTicketOrgApp(Ticket ticket, UserApp userApp);
}
