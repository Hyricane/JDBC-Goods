package com.wfit.service;

import com.wfit.model.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> queryGoods()throws Exception;

    public void addGoods(Goods goods)throws Exception;

}
