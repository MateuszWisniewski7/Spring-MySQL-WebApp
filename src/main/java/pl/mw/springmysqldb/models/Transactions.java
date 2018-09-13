package pl.mw.springmysqldb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Transactions {

    @Id
    @Column(name = "_date")
    private Timestamp date;

    @Column(name = "_value")
    private Double value;

    @Column(name = "customer")
    private Integer customer;

    public Transactions() {
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
}
