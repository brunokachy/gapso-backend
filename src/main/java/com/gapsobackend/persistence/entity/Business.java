package com.gapsobackend.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Business implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modifiedDate;
    private boolean active;

    @ManyToOne
    private PortalUser owner;

    private String mailingAddress;

    private boolean approved;

    @JsonIgnore
    @Lob
    @Basic(fetch = LAZY)
    private byte[] logo;

    public Business() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public PortalUser getOwner() {
        return owner;
    }

    public void setOwner(PortalUser owner) {
        this.owner = owner;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Business other = (Business) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Business{" + "id=" + id + ", name=" + name + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", active=" + active + ", owner=" + owner + ", mailingAddress=" + mailingAddress + ", approved=" + approved + ", logo=" + logo + '}';
    }

}
