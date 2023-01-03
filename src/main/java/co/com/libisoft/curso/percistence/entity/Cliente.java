package co.com.libisoft.curso.percistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {

    @Id
    private String id;

    private String  nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private Integer correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;


}
