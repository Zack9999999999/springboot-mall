package com.zach.springmall.dao;

import com.zach.springmall.constant.ProductCategory;
import com.zach.springmall.dto.ProductQueryParams;
import com.zach.springmall.dto.ProductRequest;
import com.zach.springmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
