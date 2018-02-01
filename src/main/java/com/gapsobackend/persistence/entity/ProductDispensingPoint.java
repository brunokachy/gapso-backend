package com.gapsobackend.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
        @Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"name", "station_id"})})
public class ProductDispensingPoint implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Station station;

    private boolean active;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductDispensingPoint other = (ProductDispensingPoint) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductDispensingPoint{" + "id=" + id + ", name=" + name + ", product=" + product + ", station=" + station + ", active=" + active + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + '}';
    }

    
    
}
