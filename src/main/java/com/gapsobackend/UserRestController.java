/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapsobackend;

import com.gapsobackend.persistence.entity.PortalUser;
import com.gapsobackend.repository.PortalUserRepository;
import com.gapsobackend.response.VerifyEmailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gapso/user")
public class UserRestController {

    private final PortalUserRepository pur;

    @Autowired
    UserRestController(PortalUserRepository pur) {
        this.pur = pur;
    }

    @RequestMapping(method = RequestMethod.POST, path = "verifyEmailAddress")
    public VerifyEmailResponse verifyEmailAddress(String emailAddress) {
        PortalUser pu = pur.findByEmailAddress(emailAddress);
        VerifyEmailResponse ver = new VerifyEmailResponse();
        ver.setEmailAddress(emailAddress);
        if (pu != null) {
            ver.setExist(true);
        } else {
            ver.setExist(false);
        }
        return ver;
    }
}
