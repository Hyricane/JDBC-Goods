package com.wfit.test;

import com.wfit.controller.GoodsController;
import com.wfit.model.Goods;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestDemo {

    private GoodsController goodsController;

    @Before
    public  void init(){
        goodsController = new GoodsController();
    }

    @Test
    public void testQuery(){
        List<Goods> list = goodsController.queryGoods();
        list.forEach(goods -> System.out.println(goods));
    }
}
