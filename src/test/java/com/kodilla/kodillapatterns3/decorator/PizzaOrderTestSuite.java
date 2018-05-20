package com.kodilla.kodillapatterns3.decorator;

import com.kodilla.kodillapatterns3.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testHawaiianPizzaWithExtraCheeseAndCokeGetPriceAndDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HawaianPizzaDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheesePizzaDecorator(pizzaOrder);
        pizzaOrder = new CokePizzaDecorator(pizzaOrder);
        //When
        BigDecimal thePrice = pizzaOrder.getPrice();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(25), thePrice);
        Assert.assertEquals("Pizza with tomato sauce and cheese + " +
                "ham and pineapple with extra cheese plus bottle of Coke", description);
    }
}
