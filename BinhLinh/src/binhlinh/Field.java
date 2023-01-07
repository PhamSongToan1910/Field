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
public class Field extends Linh{

    public Field() {
    }

    public Field(String name, int power, boolean Trangbi) {
        if(Trangbi == false){
            super.name = name;
            super.power = power;
            super.Trangbi = false;
        }
        else{
            super.name = name;
            super.power = (int) (power*1.1);
            super.Trangbi = true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isTrangbi() {
        return Trangbi;
    }

    public void setTrangbi(boolean Trangbi) {
        this.Trangbi = Trangbi;
    }

    
    
}
