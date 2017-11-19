package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        setSocialMedia(new SnapchatPublisher());
    }
}
