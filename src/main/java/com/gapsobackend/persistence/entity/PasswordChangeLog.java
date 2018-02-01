package com.gapsobackend.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class PasswordChangeLog implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PortalUser portalUser;

    private String changeCode;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date requestTime;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date completedTime;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date requestExpirationTime;

    public PasswordChangeLog() {
    }

    public Long getId() {
        return id;
    }

    public PortalUser getPortalUser() {
        return portalUser;
    }

    public void setPortalUser(PortalUser portalUser) {
        this.portalUser = portalUser;
    }

    public String getChangeCode() {
        return changeCode;
    }

    public void setChangeCode(String changeCode) {
        this.changeCode = changeCode;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    public Date getRequestExpirationTime() {
        return requestExpirationTime;
    }

    public void setRequestExpirationTime(Date requestExpirationTime) {
        this.requestExpirationTime = requestExpirationTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final PasswordChangeLog other = (PasswordChangeLog) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PasswordChangeLog{" + "id=" + id + ", portalUser=" + portalUser + ", changeCode=" + changeCode + ", requestTime=" + requestTime + ", completedTime=" + completedTime + ", requestExpirationTime=" + requestExpirationTime + '}';
    }
}
