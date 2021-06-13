package com.company;

public class Main extends SolarSystem {
    public static void main(String[] args) {

        SolarSystem solarSystem=new SolarSystem();
        solarSystem.sun=1;
        solarSystem.planet=2;
        solarSystem.moon=3;

        //working on sun features
        Sun feron=new Sun();
        feron.heat="650000k";
        feron.radius=1548865488;
        feron.temperature="5748859415 deg";
    }
}

