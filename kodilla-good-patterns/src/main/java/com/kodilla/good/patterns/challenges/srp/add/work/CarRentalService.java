package com.kodilla.good.patterns.challenges.srp.add.work;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService{
    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo){
        System.out.println("Renting Car for: " + user.getName() + user.getSurname() + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());
        return true;
    }
}
