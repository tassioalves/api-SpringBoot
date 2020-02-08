package br.com.api.awesome.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_OBJECT")
public class Object implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "OB_ID")
    private Integer id;

    @Column (name = "OB_DESCRIPTION")
    private String description;

    @Column (name = "OB_QTDE")
    private int qtde;

    @Column (name = "OB_SITUATION")
    private String situation;

    public Object() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}

