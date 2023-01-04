package co.com.libisoft.curso.percistence.crud;

import co.com.libisoft.curso.percistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoCrudRepository extends CrudRepository<Producto,Integer> {
}
