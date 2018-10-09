/*
 * William Zwart
 * 19/9/18
 * This will display how much money an employee makes.
 */
package net.pay;

/**
 *
 * @author wizwa9381
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h = 40;
        int w = 5;
        int i = 2;
        double t = 0.22;
        double n = (h * w - i) - t * (h * w - i);
        System.out.println("The amount of money the employee earns is $" + n);
        // TODO code application logic here
    }
    
}
