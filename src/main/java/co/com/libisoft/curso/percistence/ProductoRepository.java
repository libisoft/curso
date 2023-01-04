package co.com.libisoft.curso.percistence;

import co.com.libisoft.curso.percistence.crud.ProdutoCrudRepository;
import co.com.libisoft.curso.percistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProdutoCrudRepository porProdutoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) porProdutoCrudRepository.findAll();
    }

    /**
     *
     * @param idCategoria
     * @return List<Producto>
     */
    public List<Producto> getByCAtegoria(int idCategoria){
        return  porProdutoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return porProdutoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return porProdutoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return porProdutoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
         porProdutoCrudRepository.deleteById(idProducto);
    }
}
