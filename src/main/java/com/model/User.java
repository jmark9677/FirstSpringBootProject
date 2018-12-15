package com.model;


import javax.persistence.*;

@Entity
@Table(name = "asddsa")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Integer id;

    public String name;
    public String password;
    public String email;

    public User(String name, String password, String email){
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    public User() { }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
