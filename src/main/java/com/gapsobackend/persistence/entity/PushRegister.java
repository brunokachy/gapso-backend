package com.gapsobackend.persistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
class PushRegister implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @ManyToOne
    private PortalUser portalUser;

    @Column(unique = true)
    private String registerID;

    @Enumerated(EnumType.STRING)
    private Platform platform;

    public PushRegister() {
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

    public String getRegisterID() {
        return registerID;
    }

    public void setRegisterID(String registerID) {
        this.registerID = registerID;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public enum Platform {
        ANDROID("Android"),
        WEB("Web"),
        IOS("IOS");

        private final String platform;

        private Platform(String platform) {
            this.platform = platform;
        }

        public String getPlatform() {
            return platform;
        }

    }

}
