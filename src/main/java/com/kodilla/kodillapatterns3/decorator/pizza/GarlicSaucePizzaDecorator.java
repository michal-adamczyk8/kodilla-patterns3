package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class GarlicSaucePizzaDecorator extends AbstractPizzaOrderDecorator {

    public GarlicSaucePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with garlic sauce";
    }
}
