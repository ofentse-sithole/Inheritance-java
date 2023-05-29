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
public abstract class Tickets {
    private String custName;
    private String movieTitle;
    protected int custAge;
    private double custPrice;

    public Tickets(String custName, String movieTitle, int custAge, double custPrice) {
        this.custName = custName;
        this.movieTitle = movieTitle;
        this.custAge = custAge;
        this.custPrice = custPrice;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public double getCustPrice() {
        return custPrice;
    }

    public void setCustPrice(double custPrice) {
        this.custPrice = custPrice;
    }
    
    
    
    
}
