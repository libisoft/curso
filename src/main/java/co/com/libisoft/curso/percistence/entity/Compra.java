package co.com.libisoft.curso.percistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Getter
@Setter
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;
}
