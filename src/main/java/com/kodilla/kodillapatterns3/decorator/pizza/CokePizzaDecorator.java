package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class CokePizzaDecorator  extends AbstractPizzaOrderDecorator {

    public CokePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " plus bottle of Coke";
    }
}
