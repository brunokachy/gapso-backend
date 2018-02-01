package com.gapsobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gapsobackend.persistence.entity.Business;
import com.gapsobackend.persistence.entity.PortalUser;
import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Long> {

    @Override
    public List<Business> findAll();

    public Business findByNameIgnoreCase(String name);

    @Override
    public Business getOne(Long id);

    public Business findByOwner(PortalUser owner);

    public List<Business> findByActiveTrue();

    public List<Business> findByActiveFalse();

    public List<Business> findByApprovedTrue();

    public List<Business> findByApprovedFalse();

}
