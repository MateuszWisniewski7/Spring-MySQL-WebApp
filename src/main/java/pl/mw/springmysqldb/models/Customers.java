package pl.mw.springmysqldb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    @GeneratedValue
    @Column(name = "_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "branch")
    private Integer branch;

    public Customers() {
    }

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

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }
}
