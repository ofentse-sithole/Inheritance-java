/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2_paper_2019;

/**
 *
 * @author 22350628
 */
public class TicketsSales extends Tickets implements iTickets{
    
    private double custDiscount;

    public TicketsSales(String custName, String movieTitle, int  custAge, double custPrice) {
        super(custName, movieTitle, custAge, custPrice);
    }
    
    public double getDiscount (){
        if (custAge>65) 
            custDiscount = 0.10;
        else
            custDiscount =0;
            
        return custDiscount;
    }
    
    @Override
    public void print_tickets(){
        System.out.println("Customer :" + getCustName());
        System.out.println("Movie :" + getMovieTitle());
        System.out.println("Cost :" + getCustPrice());
        System.out.println("Discount :" + getDiscount());
        System.out.println("Total R:" +  getCustPrice()* (1-getDiscount()));
        
        
    }
    
}
