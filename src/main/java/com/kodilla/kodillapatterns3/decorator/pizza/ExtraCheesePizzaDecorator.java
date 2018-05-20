package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheesePizzaDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheesePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with extra cheese";
    }
}
