package co.com.libisoft.curso.percistence.crud;

import co.com.libisoft.curso.percistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoCrudRepository extends CrudRepository<Producto,Integer> {

    /**
     *
     * @param idCategoria
     * @return List<Producto>
     *
     * <p>realiza la consulta por categoria ordenando por nombre asc</p>
     *
     */
    public List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);

    /**
     *
     * @param cantidadStock
     * @param estado
     * @return Optional
     *  <p>consulta los productos escasos y activos</p>
     *
     */
    public Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
