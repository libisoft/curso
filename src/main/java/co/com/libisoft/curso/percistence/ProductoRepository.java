package co.com.libisoft.curso.percistence;

import co.com.libisoft.curso.percistence.crud.ProdutoCrudRepository;
import co.com.libisoft.curso.percistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProdutoCrudRepository porProdutoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) porProdutoCrudRepository.findAll();
    }
}
