package br.com.api.awesome.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "US_ID")
    private Integer id;
    @Column (name = "US_NAME")
    private String name;
    @Column (name = "US_DATANASC")
    private String dateNasc;
    @Column (name = "US_USER")
    private String user;
    @Column (name = "US_PASSWORD")
    private String password;


    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(String dateNasc) {
        this.dateNasc = dateNasc;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
