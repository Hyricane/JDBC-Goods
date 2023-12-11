package com.wfit.dao;

import com.wfit.model.Goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl extends Dao implements GoodsDao{
    /**
     * 查询商品信息
     * @return
     * @throws Exception
     */
    @Override
    public List<Goods> queryGoods() throws Exception{
        Connection conn = getConnection();
        String sql = "select * from t_goods";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Goods> list = new ArrayList<>();
        while (rs.next()){
            Goods goods = new Goods();
            goods.setId(rs.getString("id"));
            goods.setName(rs.getString("name"));
            goods.setPrice(rs.getDouble("price"));
            list.add(goods);
        }
        ps.close();
        rs.close();
        return list;
    }
}
