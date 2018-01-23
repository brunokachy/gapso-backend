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
class StationProductPrice implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private StationProduct stationProduct;

    private boolean active;

    private Double price = 0.0;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdDate;

    public StationProductPrice() {
    }

    public Long getId() {
        return id;
    }

    public StationProduct getStationProduct() {
        return stationProduct;
    }

    public void setStationProduct(StationProduct stationProduct) {
        this.stationProduct = stationProduct;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "StationProductPrice{" + "id=" + id + ", stationProduct=" + stationProduct + ", active=" + active + ", price=" + price + ", createdDate=" + createdDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final StationProductPrice other = (StationProductPrice) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
