package com.gapsobackend.repository;

import com.gapsobackend.persistence.entity.Business;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.gapsobackend.persistence.entity.PaymentOption;
import java.util.List;

public interface PaymentOptionRepository extends JpaRepository<PaymentOption, Long> {

    public PaymentOption findByName(String name);
    
    public List<PaymentOption> findByBusinessIsNull();
    
}
