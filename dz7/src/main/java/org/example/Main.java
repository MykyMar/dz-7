package org.example;

public class Main {
    public static void main(String[] args) {

        SolarSystem planet = SolarSystem.NEPTUNE;

        System.out.println("Попередня відстань: " + planet.getPrevDistance());
        System.out.println("Радіус: " + planet.getRadius());
        System.out.println("Попередній планета: " + planet.getPrevious());
        System.out.println("Відстань від Сонця: " + planet.getDistanceFromSun());
        System.out.println("Наступна планета: " + planet.getNext());
        System.out.println("Порядковий номер: " + planet.getSequenceNumber());


    }
}