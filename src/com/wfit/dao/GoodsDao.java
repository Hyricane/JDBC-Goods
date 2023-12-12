package com.wfit.dao;

import com.wfit.model.Goods;

import java.util.List;

public interface GoodsDao {

    public List<Goods> queryGoods() throws Exception;

    public void addGoods(Goods goods)throws Exception;
}
