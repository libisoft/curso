package co.com.libisoft.curso.domain.service;

import co.com.libisoft.curso.domain.Product;
import co.com.libisoft.curso.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }
    public Optional<List<Product>> getScarseProducts(int quantity){
        return productRepository.getScarseProducts(quantity);
    }
    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }
    public Product save(Product product){
        return productRepository.save(product);
    }
    public boolean delete(int productId){
        return getProduct(productId).map(p->{
            productRepository.delete(p.getProductId());
            return true;
        }).orElse(false);
    }
}
