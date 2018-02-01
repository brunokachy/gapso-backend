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
public class DispensingPointAttendant implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ProductDispensingPoint dispensingPoint;

    @ManyToOne
    private PortalUser attendant;

    private boolean active;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdDate;

    public DispensingPointAttendant() {
    }

    public Long getId() {
        return id;
    }

    public ProductDispensingPoint getDispensingPoint() {
        return dispensingPoint;
    }

    public void setDispensingPoint(ProductDispensingPoint dispensingPoint) {
        this.dispensingPoint = dispensingPoint;
    }

    public PortalUser getAttendant() {
        return attendant;
    }

    public void setAttendant(PortalUser attendant) {
        this.attendant = attendant;
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

    @Override
    public String toString() {
        return "DispensingPointAttendant{" + "id=" + id + ", dispensingPoint=" + dispensingPoint + ", attendant=" + attendant + ", active=" + active + ", createdDate=" + createdDate + '}';
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
        final DispensingPointAttendant other = (DispensingPointAttendant) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
