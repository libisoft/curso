package co.com.libisoft.curso.percistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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


}
