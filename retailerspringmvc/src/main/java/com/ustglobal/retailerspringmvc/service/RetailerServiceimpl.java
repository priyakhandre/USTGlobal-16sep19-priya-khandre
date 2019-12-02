package com.ustglobal.retailerspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailerspringmvc.bean.OrderProduct;
import com.ustglobal.retailerspringmvc.bean.Product;
import com.ustglobal.retailerspringmvc.bean.User;
import com.ustglobal.retailerspringmvc.dao.Retailerdao;



@Service
public class RetailerServiceimpl implements RetailerService {
	@Autowired
	private Retailerdao dao;

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean register(User user) {
		return dao.register(user);	
		}

	@Override
	public Product search(String pname) {
		return dao.search(pname);
	}

	@Override
	public boolean updatePassword(String email, String password) {
		return dao.updatePassword(email, password);
	}

	@Override
	public List<OrderProduct> getProducts(String email) {
		return dao.getProducts(email);
	}

	@Override
	public boolean buyProduct(User user, Product product, int quantity) {
		OrderProduct orderProduct=new OrderProduct();
		orderProduct.setPrice(product.getPrice());
		orderProduct.setEmail(user.getEmail());
		int total=product.getPrice()*quantity;
		orderProduct.setTotal(total);
		orderProduct.setPname(product.getPname());
		orderProduct.setQuantity(quantity);	
		return dao.buyProduct(orderProduct);
	}
}
	
	