package fr.bjacob.runningcuba.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "RUNNINGCUBA_RUNNER")
@Entity(name = "runningcuba$Runner")
public class Runner extends StandardEntity {
    private static final long serialVersionUID = -8939620587385482748L;

    @Column(name = "NOM")
    protected String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }


}