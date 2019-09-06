package com.company;

public class Main {

    public static void main(String[] args) {
    Warrior w = new Warrior() ;
    w.setDamage(50);
    w.setHealth(300);
    w.setSuperAdults(80);

    Mental m = new Mental() ;
    m.setDamage(50);
    m.setHealth(300);
    m.setSuperAdults(80);

    Magic mag = new Magic();
    mag.setDamage(50);
    mag.setHealth(300);
    mag.setSuperAdults(80);

    Boss b = new Boss();
    b.setDamage(100);
    b.setHealth(500);
    b.setDefence(20);
    }

}
