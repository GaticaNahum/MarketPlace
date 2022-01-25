package mx.edu.utez.MarketPlace.Category.Model;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "text", unique = true) //Eso es para que si tienen el mismo nombre no deje insertar mas de una, o sea que no se repitan
    private String description;

    public Category() {
    }

    public Category(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
