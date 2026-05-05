package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        // Room Class
        Room room1 = new Room(2, 150.0, false, false);
        Room room2 = new Room(1, 100.0, true, false);
        Room room3 = new Room(3, 200.0, false, true);

        System.out.println("Room 1:");
        System.out.println(room1);

        System.out.println();

        System.out.println("Room 2:");
        System.out.println(room2);

        System.out.println();

        System.out.println("Room 3:");
        System.out.println(room3);

        System.out.println();

        // Reservation Class
        Reservation reservation1 = new Reservation();
        reservation1.setRoomType("king");
        reservation1.setNumberOfNights(3);
        reservation1.setIsWeekend(true);

        Reservation reservation2 = new Reservation();
        reservation2.setRoomType("double");
        reservation2.setNumberOfNights(5);
        reservation2.setIsWeekend(false);

        System.out.println("Reservation 1:");
        System.out.println(reservation1);

        System.out.println();

        System.out.println("Reservation 2:");
        System.out.println(reservation2);

        System.out.println();

        // Employee Class
        Employee employee1 = new Employee(1, "Kiz", "IT", 16.39, 48);
        System.out.println("Employee 1:");
        System.out.println(employee1);
    }
}