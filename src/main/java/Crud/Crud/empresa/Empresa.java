package Crud.Crud.empresa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id_empresa;

   // @Column (name= "name_empresa") Este atributo nos indica que el nombre verdadero de la base de datos
    private String nombre_empresa;
    private String direccion_empresa;


    //Click derecho "Java Code Generators"
    public Empresa(long id_empresa, String nombre_empresa, String direccion_empresa) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.direccion_empresa = direccion_empresa;
    }


    public long getId_empresa() {
        return this.id_empresa;
    }

    public void setId_empresa(long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_empresa() {
        return this.nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion_empresa() {
        return this.direccion_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

}
