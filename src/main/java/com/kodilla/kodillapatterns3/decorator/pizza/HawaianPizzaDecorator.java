package com.kodilla.kodillapatterns3.decorator.pizza;

import java.math.BigDecimal;

public class HawaianPizzaDecorator extends AbstractPizzaOrderDecorator {
    public HawaianPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ham and pineapple";
    }
}
