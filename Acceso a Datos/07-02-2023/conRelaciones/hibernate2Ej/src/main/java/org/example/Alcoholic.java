package org.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Alcoholic")
public class Alcoholic implements Serializable {

    private int Id;
    private boolean Alcoholic;
    private int idBebida;
    private Cocktail cocktail;

    public Alcoholic() {
    }

    public Alcoholic(boolean alcoholic, int idBebida) {
        Alcoholic = alcoholic;
        this.idBebida = idBebida;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    @ManyToOne()
    @JoinColumn(name = "idBebida", insertable = false, updatable = false)
    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column(name="IsAlcoholic")
    public boolean isAlcoholic() {
        return Alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        Alcoholic = alcoholic;
    }
}
