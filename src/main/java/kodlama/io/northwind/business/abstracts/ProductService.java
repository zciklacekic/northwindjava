package kodlama.io.northwind.business.abstracts;

import java.util.List;

import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.entities.concretes.Product;
import kodlama.io.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
