package nLayeredDemo.bussiness.concretes;

import java.util.List;

import nLayeredDemo.bussiness.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi " + product.getName());
		

	}

	@Override
	public List<Product> getAll() {

		return null;
	}

}
