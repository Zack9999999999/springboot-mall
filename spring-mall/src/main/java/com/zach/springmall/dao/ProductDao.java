package com.zach.springmall.dao;

import com.zach.springmall.dto.ProductRequest;
import com.zach.springmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
