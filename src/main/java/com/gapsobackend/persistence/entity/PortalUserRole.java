package com.gapsobackend.persistence.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
class PortalUserRole implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Business business;

    @ManyToOne
    private Station station;

    @ManyToOne
    private PortalUser portalUser;

    @Transient
    private DispensingPointAttendant dispensingPointAttendant;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    private boolean active;

    public PortalUserRole() {
    }

    public Long getId() {
        return id;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public PortalUser getPortalUser() {
        return portalUser;
    }

    public void setPortalUser(PortalUser portalUser) {
        this.portalUser = portalUser;
    }

    public DispensingPointAttendant getDispensingPointAttendant() {
        return dispensingPointAttendant;
    }

    public void setDispensingPointAttendant(DispensingPointAttendant dispensingPointAttendant) {
        this.dispensingPointAttendant = dispensingPointAttendant;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public enum Designation {
        SUPERADMIN("Super Admin"),
        BUSINESSMANAGER("Business Manager"),
        STATIONMANAGER("Station Manager"),
        ATTENDANT("Attendant");

        private final String designation;

        private Designation(String designation) {
            this.designation = designation;
        }

        public String getDesignation() {
            return designation;
        }
    }

    @Override
    public String toString() {
        return "PortalUserRole{" + "id=" + id + ", business=" + business + ", station=" + station + ", portalUser=" + portalUser + ", dispensingPointAttendant=" + dispensingPointAttendant + ", designation=" + designation + ", active=" + active + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final PortalUserRole other = (PortalUserRole) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
