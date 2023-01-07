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
public class Linh {
    public String name;
    public int power;
    public boolean Trangbi;

    public Linh() {
    }

    public Linh(String name, int power, boolean Trangbi) {
        this.name = name;
        this.power = power;
        this.Trangbi = Trangbi;
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
