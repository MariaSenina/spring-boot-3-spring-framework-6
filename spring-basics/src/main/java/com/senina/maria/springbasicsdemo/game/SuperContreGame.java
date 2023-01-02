package com.senina.maria.springbasicsdemo.game;

public class SuperContreGame implements GamingConsole {

    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }

    @Override
    public String toString() {
        return "SuperContreGame{}";
    }
}
