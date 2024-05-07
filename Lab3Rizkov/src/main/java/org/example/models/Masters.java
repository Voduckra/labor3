package org.example.models;


import jakarta.persistence.*;
@Entity
@Table(name = "Masters")
@NamedQuery(name = "Masters.getAll", query = "SELECT m from Masters m")
public class Masters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_master", nullable = false)
    private Integer id;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "surname", length = 255)
    private String surname;
    @Column(name="exist")
    private Boolean isDeleted;
    public Masters(Integer id, String name,String surname, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.isDeleted = isDeleted;
    }
    public Masters() {}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public void setSurname(String name) {
        this.surname=name;
    }
}