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
public class Service {
    
    public void ChienDau(Linh a, Linh b){
        if(a.getPower() > b.getPower()){
            System.out.println("Win: "+a.getName());
        }
        else if(a.getPower() < b.getPower()){
            System.out.println("Win: "+b.getName());
        }
        else{
            System.out.println("Hoà");
        }
    }
    
    public void InThongTin(Linh a){
        System.out.println("Name: "+a.getName());
        if(a instanceof Field){
            System.out.println("Position: Lính");
        }
        
        else if(a instanceof CungThu){
            System.out.println("Position: Cung thủ");
        }
        else if(a instanceof KiemSi){
            System.out.println("Position: Kiếm sĩ");
        }
        else if(a instanceof DauSi){
            System.out.println("Position: Đấu sĩ");
        }
        System.out.println("Power: "+a.getPower());
        if(a.isTrangbi() == true){
            System.out.println("Trang bị: có");
        }
        else{
            System.out.println("Trang bị: không");
        }
    }
    
}
