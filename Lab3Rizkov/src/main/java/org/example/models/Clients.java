package org.example.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Clients")
@NamedQuery(name = "Clients.getAll", query = "SELECT c from Clients c")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_client", nullable = false)
    private Integer id;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "surname", length = 255)
    private String surname;
    @ManyToOne
    @JoinColumn(name = "id_masters")
    private Masters idMasters;
    @Column(name = "exist")
    private Boolean isDeleted;

    public Clients(Integer id, String name, String surname,Masters idMasters, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.idMasters = idMasters;
        this.isDeleted = isDeleted;
    }
    public Clients() {}
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
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Masters getIdStylists() {
        return idMasters;
    }
    public void setIdStylists(Masters idMasters) {
        this.idMasters = idMasters;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}