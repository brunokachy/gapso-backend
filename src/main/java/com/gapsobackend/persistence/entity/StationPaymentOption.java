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
    @UniqueConstraint(columnNames = {"payment_option_id", "station_id"})})
public class StationPaymentOption implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PaymentOption paymentOption;

    @ManyToOne
    private Station station;

    private boolean active;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date addedDate;

    public StationPaymentOption() {
    }

    public Long getId() {
        return id;
    }

    public PaymentOption getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
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

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "StationPaymentOption{" + "id=" + id + ", paymentOption=" + paymentOption + ", station=" + station + ", active=" + active + ", addedDate=" + addedDate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final StationPaymentOption other = (StationPaymentOption) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
