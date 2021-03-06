package com.kodilla.good.patterns.challenges.food.two.door;
public class OrderDto {
    private Contractor contractor;
    private boolean isProcessed;

    public OrderDto(final Contractor contractor,final  boolean isProcessed) {
        this.contractor= contractor;
        this.isProcessed = isProcessed;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public boolean isProcessed() {
        return isProcessed;
    }
}
