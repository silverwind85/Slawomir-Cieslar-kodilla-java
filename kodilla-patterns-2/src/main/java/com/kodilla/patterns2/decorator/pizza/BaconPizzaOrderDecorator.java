package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BeconPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    protected BeconPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.5));
    }

    @Override
    public String getName() {
        return super.getName()+" becon";
    }
}
