package com.org.service;

import java.util.List;
import com.org.dao.ProductDAO;
import com.org.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
public class ProductService {

	@Autowired
	ProductDAO productDao;
	
	@Transactional
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Transactional
	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}

	@Transactional
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Transactional
	public void updateProduct(Product product) {
		productDao.updateProduct(product);

	}

	@Transactional
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}
}
