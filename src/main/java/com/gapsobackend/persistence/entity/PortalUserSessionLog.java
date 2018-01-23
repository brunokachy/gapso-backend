package com.gapsobackend.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
class PortalUserSessionLog implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;

    private String userEmail;

    @Enumerated(EnumType.STRING)
    private PushRegister.Platform platform;

    private String ipaddress;

    private Long userId;

    public PortalUserSessionLog() {
    }

    public Long getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public PushRegister.Platform getPlatform() {
        return platform;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public enum Platform {
        Mobile("Mobile"),
        WEB("Web");

        private final String platform;

        private Platform(String platform) {
            this.platform = platform;
        }

        public String getPlatform() {
            return platform;
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final PortalUserSessionLog other = (PortalUserSessionLog) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PortalUserSessionLog{" + "id=" + id + ", dateCreated=" + dateCreated + ", userEmail=" + userEmail + ", platform=" + platform + ", ipaddress=" + ipaddress + ", userId=" + userId + '}';
    }

}
