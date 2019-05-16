package com.dougblizz.library.games.database.entities;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="isOnline")
    private Boolean isOnline;

    @Column(name="isPaid")
    private Boolean isPaid;

    public Games() {
    }

    public Games(int id, String name, String type, Boolean isOnline, Boolean isPaid) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isOnline = isOnline;
        this.isPaid = isPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
