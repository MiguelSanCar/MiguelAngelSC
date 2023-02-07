package org.example;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Cocktail")
public class Cocktail implements Serializable {

    private int id;
    private int idDrink;
    private String strDrink;
    private String strCategory;
    private String strAlcoholic;
    private String strInstructions;
    private String strDrinkThumb;
    private Set<Alcoholic> alcoholics;

    public Cocktail() {
    }

    public Cocktail(int id, int idDrink, String strDrink, String strCategory, String strAlcoholic, String strInstructions, String strDrinkThumb) {
        this.id = id;
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strCategory = strCategory;
        this.strAlcoholic = strAlcoholic;
        this.strInstructions = strInstructions;
        this.strDrinkThumb = strDrinkThumb;
    }

    @OneToMany(mappedBy = "cocktail")
    public Set<Alcoholic> getMeasures() {
        return alcoholics;
    }

    public void setMeasures(Set<Alcoholic> measure) {
        this.alcoholics = measure;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "idDrink")
    public int getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(int idDrink) {
        this.idDrink = idDrink;
    }
    @Column(name = "StrDrink")
    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }
    @Column(name = "StrCategory")

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    @Column(name = "getStrAlcoholic")
    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    @Column(name = "StrInstructions", columnDefinition = "varchar(MAX)")
    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    @Column(name = "StrDrinkThumb",columnDefinition = "varchar(MAX)")
    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "id=" + id +
                ", idDrink=" + idDrink +
                ", strDrink='" + strDrink + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                '}';
    }
}
