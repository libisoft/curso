package co.com.libisoft.curso.percistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "categorias")
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
    public Categoria() {
    }
}
