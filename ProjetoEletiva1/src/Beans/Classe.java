/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ianbe
 */
@Entity
@Table(name = "classe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classe.findAll", query = "SELECT c FROM Classe c")
    , @NamedQuery(name = "Classe.findByIdclasse", query = "SELECT c FROM Classe c WHERE c.idclasse = :idclasse")
    , @NamedQuery(name = "Classe.findByAnoclasse", query = "SELECT c FROM Classe c WHERE c.anoclasse = :anoclasse")
    , @NamedQuery(name = "Classe.findByPeriodo", query = "SELECT c FROM Classe c WHERE c.periodo = :periodo")
    , @NamedQuery(name = "Classe.findByTurma", query = "SELECT c FROM Classe c WHERE c.turma = :turma")
    , @NamedQuery(name = "Classe.findByProfessor", query = "SELECT c FROM Classe c WHERE c.professor = :professor")
    , @NamedQuery(name = "Classe.findByStatus", query = "SELECT c FROM Classe c WHERE c.status = :status")})
public class Classe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idclasse")
    private Integer idclasse;
    @Basic(optional = false)
    @Column(name = "anoclasse")
    private int anoclasse;
    @Basic(optional = false)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "turma")
    private String turma;
    @Basic(optional = false)
    @Column(name = "professor")
    private String professor;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classeIdclasse")
    private List<Aluno> alunoList;

    public Classe() {
    }

    public Classe(Integer idclasse) {
        this.idclasse = idclasse;
    }

    public Classe(Integer idclasse, int anoclasse, String periodo, String turma, String professor, boolean status) {
        this.idclasse = idclasse;
        this.anoclasse = anoclasse;
        this.periodo = periodo;
        this.turma = turma;
        this.professor = professor;
        this.status = status;
    }

    public Integer getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Integer idclasse) {
        this.idclasse = idclasse;
    }

    public int getAnoclasse() {
        return anoclasse;
    }

    public void setAnoclasse(int anoclasse) {
        this.anoclasse = anoclasse;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @XmlTransient
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclasse != null ? idclasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classe)) {
            return false;
        }
        Classe other = (Classe) object;
        if ((this.idclasse == null && other.idclasse != null) || (this.idclasse != null && !this.idclasse.equals(other.idclasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beans.Classe[ idclasse=" + idclasse + " ]";
    }
    
}