package com.wfit.controller;

import com.wfit.model.Goods;
import com.wfit.service.GoodsService;
import com.wfit.service.GoodsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class GoodsController {

    private GoodsService goodsService;

    /**
     * 查询
     * @return
     */
    public List<Goods> queryGoods(){
        goodsService = new GoodsServiceImpl();
        List<Goods> list = new ArrayList<>();
        try{
            list = goodsService.queryGoods();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    /**
     * 增加
     * @param goods
     */
    public void addGoods(Goods goods){
        goodsService = new GoodsServiceImpl();
        try{
            goodsService.addGoods(goods);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
