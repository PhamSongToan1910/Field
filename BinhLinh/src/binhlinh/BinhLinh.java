/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binhlinh;

/**
 *
 * @author ACER
 */
public class BinhLinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Linh a = new CungThu("A", 50, true);
        Linh b = new DauSi("B", 50, true);
        Service s = new Service();
        s.ChienDau(a, b);
        s.InThongTin(a);
        s.InThongTin(b);
    }
    
}
