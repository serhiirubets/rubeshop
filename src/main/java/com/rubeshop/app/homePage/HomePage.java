package com.rubeshop.app.homePage;

import com.rubeshop.app.deal.Deal;
import com.rubeshop.app.homeCategory.HomeCategory;
import lombok.Data;

import java.util.List;

@Data
public class HomePage {
    private List<HomeCategory> grid;
    private List<HomeCategory> shopByCategories;
    private List<HomeCategory> electricCategories;
    private List<HomeCategory> dealCategories;
    private List<Deal> deals;
}
