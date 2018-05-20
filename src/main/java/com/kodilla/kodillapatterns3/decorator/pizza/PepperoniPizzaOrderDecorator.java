package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniPizzaOrderDecorator extends AbstractPizzaOrderDecorator {

    public PepperoniPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + pepperoni";
    }

}
