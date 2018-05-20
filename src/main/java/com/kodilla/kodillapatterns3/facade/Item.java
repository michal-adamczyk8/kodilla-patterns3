package com.kodilla.kodillapatterns3.facade;

public class Item {
    private final long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductID() {
        return productId;
    }

    public double getQty() {
        return qty;
    }

}
