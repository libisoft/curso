package co.com.libisoft.curso.domain.repository;

import co.com.libisoft.curso.domain.Product;
import co.com.libisoft.curso.percistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Producto>> getByCategory(int categoryId);
    Optional<List<Producto>> getScarseProducts(int quantity);
    Optional<Producto> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
