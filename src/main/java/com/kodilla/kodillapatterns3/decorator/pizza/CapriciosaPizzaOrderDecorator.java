package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class CapriciosaPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public CapriciosaPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + mushrooms and ham";
    }
}
