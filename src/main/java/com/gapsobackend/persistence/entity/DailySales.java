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
import javax.persistence.Transient;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class DailySales implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date saleDate;

    private Double quantity;

    @ManyToOne
    private DispensingPointAttendant dispensingPointAttendant;

    @ManyToOne
    private StationProductPrice stationProductPrice;

    @ManyToOne
    private StationPaymentOption stationPaymentOption;

    @Transient
    private Long paymentOptionId;

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public DispensingPointAttendant getDispensingPointAttendant() {
        return dispensingPointAttendant;
    }

    public void setDispensingPointAttendant(DispensingPointAttendant dispensingPointAttendant) {
        this.dispensingPointAttendant = dispensingPointAttendant;
    }

    public StationProductPrice getStationProductPrice() {
        return stationProductPrice;
    }

    public void setStationProductPrice(StationProductPrice stationProductPrice) {
        this.stationProductPrice = stationProductPrice;
    }

    public StationPaymentOption getStationPaymentOption() {
        return stationPaymentOption;
    }

    public void setStationPaymentOption(StationPaymentOption stationPaymentOption) {
        this.stationPaymentOption = stationPaymentOption;
    }

    public Long getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setPaymentOptionId(Long paymentOptionId) {
        this.paymentOptionId = paymentOptionId;
    }

    public DailySales() {
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DailySales{" + "id=" + id + ", saleDate=" + saleDate + ", quantity=" + quantity + ", dispensingPointAttendant=" + dispensingPointAttendant + ", stationProductPrice=" + stationProductPrice + ", stationPaymentOption=" + stationPaymentOption + ", paymentOptionId=" + paymentOptionId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final DailySales other = (DailySales) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
