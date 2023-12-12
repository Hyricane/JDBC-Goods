package com.wfit.service;

import com.wfit.dao.GoodsDao;
import com.wfit.dao.GoodsDaoImpl;
import com.wfit.model.Goods;

import java.util.List;

public class GoodsServiceImpl implements GoodsService{

    private GoodsDao goodsDao; //IoC 控制反转

    /**
     * 查询
     * @return
     * @throws Exception
     */
    @Override
    public List<Goods> queryGoods() throws Exception {
        goodsDao = new GoodsDaoImpl();
        return goodsDao.queryGoods();
    }

    /**
     * 新增
     * @param goods
     * @throws Exception
     */
    @Override
    public void addGoods(Goods goods) throws Exception {
        goodsDao = new GoodsDaoImpl();
        goodsDao.addGoods(goods);
    }


}
