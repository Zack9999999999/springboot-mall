package com.zach.springmall.service;

import com.zach.springmall.dto.ProductRequest;
import com.zach.springmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    public Integer createProduct(ProductRequest productRequest);
}
