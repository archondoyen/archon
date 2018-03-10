package com.iotek.dao;

import com.iotek.po.ProductDetail;

/**
 * Created by xiaohuang on 2018/3/1.
 */
public interface ProductDetailDao {
    com.iotek.po.ProductDetail findProductDetailById(int id);
    com.iotek.po.ProductDetail findProductDetailByPId(int pId);
}
