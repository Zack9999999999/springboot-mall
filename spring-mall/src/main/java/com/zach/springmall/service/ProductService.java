package com.zach.springmall.service;

import com.zach.springmall.dto.ProductRequest;
import com.zach.springmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
}
