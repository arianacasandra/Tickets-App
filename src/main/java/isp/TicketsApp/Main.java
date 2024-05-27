package isp.TicketsApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int ch = -1;
        Ticket ticket= null ;
        System.out.println("Wellcome to our application.Please chose a ticket:\n1---Cinema Ticket\n2---Spa Ticket\n3---Theatre Ticket\n4---Football Match Ticket\n0---Exit");
        while(ch!=0)
        {
            Scanner scanner = new Scanner(System.in);
            ch=scanner.nextInt();
            switch(ch){
                case 1: ticket=new Ticket(1,TicketCategory.CINEMA);
                        break;
                case 2: ticket=new Ticket(2,TicketCategory.SPA);
                         break;
                case 3: ticket=new Ticket(3,TicketCategory.THEATRE);
                        break;
                case 4: ticket=new Ticket(4,TicketCategory.FOOTBALLMATCH);
                        break;
                default: break;
            }
        }
        User user =new User( "Ariana", 23);
        UserApp userApp = new UserApp(ticket, user);
        System.out.println((userApp.getTicket()).getTicketCategory());
        Organiser organiser = new Organiser("IULIUS MALL", 1);
        OrganiserApp organiserApp = new OrganiserApp(organiser);
        userApp.payTicket();
        organiserApp.payTicketOrgApp(ticket,userApp);

    }
}
