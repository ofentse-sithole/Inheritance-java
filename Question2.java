/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2_paper_2019;

import java.util.Scanner;

/**
 *
 * @author 22350628
 */
public class Question2_Paper_2019 {
 
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name = "", title ="";
    double price = 0.0;
    int age = 0;
 
    TicketsSales a = new TicketsSales(name,title,age,price);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the customer name: ");
    name = input.nextLine();
    a.setCustName(name);
        System.out.println("Enter Movie Title: ");
        title = input.nextLine();
        a.setMovieTitle(title);
        System.out.println("Enter the Customer age: ");
        age = input.nextInt(age);
        a.setCustAge(age);
        System.out.println("Enter price: ");
        price = input.nextDouble();
        a.setCustPrice(price);
        a.print_tickets();
        
        
    }
    
}
