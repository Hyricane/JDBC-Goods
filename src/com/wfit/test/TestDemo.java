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

    @Test
    public void testAdd(){
        Goods goods = new Goods();
        goods.setId("1003");
        goods.setName("鼠标");
        goods.setPrice(100);
        goodsController.addGoods(goods);
    }
}
