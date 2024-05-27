package isp.TicketsApp;

import java.util.Scanner;

public  class UserApp implements Payment {
    private Ticket ticket;
    private User user;
    private boolean payment =false;
    public UserApp(Ticket ticket,User user)
    {
        this.ticket = ticket;
        this.user=user;
    }

    public boolean isPayment() {
        return payment;
    }

    public Ticket getTicket()
    {
        return ticket;
    }
    public void setTicket(Ticket ticket)
    {
        this.ticket = ticket;
    }
    public User getUser()
    {
        return user;
    }
    @Override
    public void payTicketOrgApp(Ticket ticket, UserApp userApp){};
    @Override
    public void payTicket()
    {
        System.out.println("You are going to pay your ticket");
        if(user.getMoney()>= ticket.getPrice())
        {
            System.out.println("You paid for your ticket");
            user.setMoney(user.getMoney()- ticket.getPrice());
            System.out.println("Your current money "+ user.getMoney());
            payment=true;
        }
        else {
                System.out.println("You don't have enough money");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press 1: to introduce money \nPress 0: to exit");
                int c = scanner.nextInt();
                if(c==1) {
                    System.out.println("Introduce the sum of money");
                    float sum=0;
                    sum= scanner.nextFloat();
                    user.setMoney(user.getMoney()+sum);
                    payTicket();

                }
                else System.out.println("Thank you for your time");

             }
    }



    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString()
    {
        return user.toString() +"\n"+ ticket.toString();
    }
    public String viewTicket()
    {
        return ticket.toString();
    }



    public static void main(String[] args)
    {
        Ticket ticket = new Ticket(1, TicketCategory.CINEMA);
        User user =new User( "Ariana", 100);
        UserApp userApp = new UserApp(ticket,user);
        //System.out.println(userApp.viewTicket());

        //System.out.println(userApp.toString());
        Ticket ticket2 = new Ticket(2, TicketCategory.SPA);
        userApp.setTicket(ticket2);
       // System.out.println(userApp.toString());
        userApp.payTicket();





    }


}
