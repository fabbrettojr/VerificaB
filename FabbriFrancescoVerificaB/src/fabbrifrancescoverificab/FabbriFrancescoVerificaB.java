/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabbrifrancescoverificab;

/**
 *
 * @author fabbri.francesco
 */
public class FabbriFrancescoVerificaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Evento ev1 = new Evento("wonderlast", 50, 2100, 200);
        Evento ev2 = new Evento("beachparty", 70, 1800, 120);
        ev1.VendiBiglietti(130);
        ev1.RistampaBiglietti(100);
        System.out.println(ev1.ToString());
        ev2.VendiBiglietti(90);
        ev2.RistampaBiglietti(50);
        System.out.println(ev2.ToString());
        System.out.println("il primo evento e uguale al secondo? " + ev1.equals(ev2));
    }
    
}
