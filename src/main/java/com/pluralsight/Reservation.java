package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation() {

    }

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            return 124;
        }

        throw new IllegalArgumentException("Invalid room type: " + roomType);
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        if (isWeekend) {
            return (getPrice() * 1.1) * this.numberOfNights;
        } else {
            return getPrice() * this.numberOfNights;
        }
    }

    public String toString() {
        return String.format(
                "Room Type: %s%n" +
                "Number Of Nights: %d%n" +
                "Weekend: %b%n" +
                "Reservation Total: $%.2f%n",
                getRoomType(),
                getNumberOfNights(),
                isWeekend(),
                getReservationTotal()
        );
    }
}