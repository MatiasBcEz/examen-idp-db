package cl.duoc.integraciondb.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
//@Table(name = "persona", schema = "schema_name")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idpersona")
    private int    idPersona;

    @Basic
    @Column (name = "nombre")
    private String nombre;

    @Basic
    @Column (name = "apellido")
    private String apellido;

    @Basic
    @Column(name = "telefono")
    private String telefono;

    @Basic
    @Column(name = "dni")
    private String dni;

    public Persona() {
    }

    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
