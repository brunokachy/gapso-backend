package com.gapsobackend.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLevel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private boolean active;

    @ManyToOne
    private StationProduct stationProduct;

    private Double newLevel = 0.0;

    private Double previousLevel = 0.0;

    private Double newSupply = 0.0;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public ProductLevel() {
    }

    public Long getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public StationProduct getStationProduct() {
        return stationProduct;
    }

    public void setStationProduct(StationProduct stationProduct) {
        this.stationProduct = stationProduct;
    }

    public Double getNewLevel() {
        return newLevel;
    }

    public void setNewLevel(Double newLevel) {
        this.newLevel = newLevel;
    }

    public Double getPreviousLevel() {
        return previousLevel;
    }

    public void setPreviousLevel(Double previousLevel) {
        this.previousLevel = previousLevel;
    }

    public Double getNewSupply() {
        return newSupply;
    }

    public void setNewSupply(Double newSupply) {
        this.newSupply = newSupply;
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
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final ProductLevel other = (ProductLevel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductLevel{" + "id=" + id + ", active=" + active + ", stationProduct=" + stationProduct + ", newLevel=" + newLevel + ", previousLevel=" + previousLevel + ", newSupply=" + newSupply + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + '}';
    }

}
