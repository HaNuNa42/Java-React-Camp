package nLayeredDemo.bussiness.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {

	void add(Product product);
	
	List<Product> getAll();
}
