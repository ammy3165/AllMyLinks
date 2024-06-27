package com.amrendra.AllMyLinks.Entity;

import jakarta.persistence.*;

@Entity
public class Link extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String LinkCreated;
//    @OneToMany
    private String created_by;
    private String created_at;
//    @OneToMany
    private String updated_by; 
    private String updated_at;


    @Override
    public String toString() {
        return "Link {" +
                "id=" + id +
                ", LinkCreated='" + LinkCreated + '\'' +
                ", created_by='" + created_by + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_by='" + updated_by + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }
}
