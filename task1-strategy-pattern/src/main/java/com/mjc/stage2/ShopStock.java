package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List executeFilteringStrategy(FilteringStrategy filteringStrategy){
        List<Product> filteredProducts = new ArrayList<>();
        for (Product p : productList){
            if (filteringStrategy.filter(p)){
                filteredProducts.add(p);
            }
        }
        return filteredProducts;
    }
}
