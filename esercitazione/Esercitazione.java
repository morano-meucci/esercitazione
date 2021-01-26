/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

/**
 *
 * @author 39334
 */
public class Esercitazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumberHelper ora = new NumberHelper(4);
        System.out.println(ora.isEven());
        System.out.println(ora.isOdd());
        System.out.println(ora.sum(2));
        System.out.println(ora.isPrime());
        System.out.println(ora.isDivisibleBy(2));
    }

}
