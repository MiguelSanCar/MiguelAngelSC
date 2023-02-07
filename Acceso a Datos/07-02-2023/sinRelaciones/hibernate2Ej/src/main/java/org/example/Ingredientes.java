package org.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Ingredientes")
public class Ingredientes implements Serializable {
    private int Id;
    private String ingrediente;
    private int idBebida;

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public Ingredientes() {
    }

    public Ingredientes(String ingrediente, int idBebida) {
        this.ingrediente = ingrediente;
        this.idBebida = idBebida;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column(name="Ingrediente")
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    @Override
    public String toString() {
        return "Ingredientes{" +
                "Id=" + Id +
                ", ingrediente='" + ingrediente + '\'' +
                ", idBebida=" + idBebida +
                '}';
    }
}
