package co.com.libisoft.curso.percistence;

import co.com.libisoft.curso.domain.Product;
import co.com.libisoft.curso.domain.repository.ProductRepository;
import co.com.libisoft.curso.percistence.crud.ProdutoCrudRepository;
import co.com.libisoft.curso.percistence.entity.Producto;
import co.com.libisoft.curso.percistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    private ProdutoCrudRepository porProdutoCrudRepository;
    private ProductMapper mapper;

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) porProdutoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = porProdutoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos = porProdutoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(p->mapper.toProducts(p));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return porProdutoCrudRepository.findById(productId).map(p->mapper.toProduct(p));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(porProdutoCrudRepository.save(producto));
    }

    @Override
    public void delete(int idProducto){
         porProdutoCrudRepository.deleteById(idProducto);
    }
}
