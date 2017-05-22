package modelo;
// Generated 22-may-2017 20:29:03 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idInicio;
     private String nombreInicio;
     private String passInicio;
     private Set cuentases = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(String nombreInicio, String passInicio) {
        this.nombreInicio = nombreInicio;
        this.passInicio = passInicio;
    }
    public Usuarios(String nombreInicio, String passInicio, Set cuentases) {
       this.nombreInicio = nombreInicio;
       this.passInicio = passInicio;
       this.cuentases = cuentases;
    }
   
    public Integer getIdInicio() {
        return this.idInicio;
    }
    
    public void setIdInicio(Integer idInicio) {
        this.idInicio = idInicio;
    }
    public String getNombreInicio() {
        return this.nombreInicio;
    }
    
    public void setNombreInicio(String nombreInicio) {
        this.nombreInicio = nombreInicio;
    }
    public String getPassInicio() {
        return this.passInicio;
    }
    
    public void setPassInicio(String passInicio) {
        this.passInicio = passInicio;
    }
    public Set getCuentases() {
        return this.cuentases;
    }
    
    public void setCuentases(Set cuentases) {
        this.cuentases = cuentases;
    }




}


