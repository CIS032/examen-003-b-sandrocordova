/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sandro Córdova
 */
@Entity
@Table(name = "PROFESOR", catalog = "", schema = "PRUEBA")
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByNombres", query = "SELECT p FROM Profesor p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Profesor.findByCedula", query = "SELECT p FROM Profesor p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesor.findByApellidos", query = "SELECT p FROM Profesor p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Profesor.findByCarrera", query = "SELECT p FROM Profesor p WHERE p.carrera = :carrera")
    , @NamedQuery(name = "Profesor.findByTipoprofesor", query = "SELECT p FROM Profesor p WHERE p.tipoprofesor = :tipoprofesor")
    , @NamedQuery(name = "Profesor.findByHorasclase", query = "SELECT p FROM Profesor p WHERE p.horasclase = :horasclase")
    , @NamedQuery(name = "Profesor.findByHorascomplementarias", query = "SELECT p FROM Profesor p WHERE p.horascomplementarias = :horascomplementarias")})
public class Profesor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "NOMBRES")
    private String nombres;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "CARRERA")
    private String carrera;
    @Column(name = "TIPOPROFESOR")
    private String tipoprofesor;
    @Column(name = "HORASCLASE")
    private Integer horasclase;
    @Column(name = "HORASCOMPLEMENTARIAS")
    private Integer horascomplementarias;

    public Profesor() {
    }

    public Profesor(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        String oldCarrera = this.carrera;
        this.carrera = carrera;
        changeSupport.firePropertyChange("carrera", oldCarrera, carrera);
    }

    public String getTipoprofesor() {
        return tipoprofesor;
    }

    public void setTipoprofesor(String tipoprofesor) {
        String oldTipoprofesor = this.tipoprofesor;
        this.tipoprofesor = tipoprofesor;
        changeSupport.firePropertyChange("tipoprofesor", oldTipoprofesor, tipoprofesor);
    }

    public Integer getHorasclase() {
        return horasclase;
    }

    public void setHorasclase(Integer horasclase) {
        Integer oldHorasclase = this.horasclase;
        this.horasclase = horasclase;
        changeSupport.firePropertyChange("horasclase", oldHorasclase, horasclase);
    }

    public Integer getHorascomplementarias() {
        return horascomplementarias;
    }

    public void setHorascomplementarias(Integer horascomplementarias) {
        Integer oldHorascomplementarias = this.horascomplementarias;
        this.horascomplementarias = horascomplementarias;
        changeSupport.firePropertyChange("horascomplementarias", oldHorascomplementarias, horascomplementarias);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "prueba_3.Profesor[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
