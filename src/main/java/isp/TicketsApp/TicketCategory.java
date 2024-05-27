package isp.TicketsApp;

public enum TicketCategory {
    CINEMA("Cinema City Ticket"),
    SPA("Spa Ticket"),
    THEATRE("Theatre Ticket"),
    FOOTBALLMATCH("Football Match Ticket");
    private String displayName;

     TicketCategory(String displayName)
    {
        this.displayName = displayName;
    }



    @Override
    public String toString() {
        return this.displayName;
    }
}
