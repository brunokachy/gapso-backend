package com.gapsobackend.repository;

import com.gapsobackend.persistence.entity.PortalUser;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortalUserRepository extends JpaRepository<PortalUser, Long> {

    public PortalUser findByEmailAddress(String emailAddress);
    
    public PortalUser findByToken(String token);
    
    public List<PortalUser> findByActiveFalse();
    
     public List<PortalUser> findByActiveTrue();
     
    @Override
     public List<PortalUser> findAll();
     
     
   
}
