package com.gapsobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gapsobackend.persistence.entity.DailySales;
import com.gapsobackend.persistence.entity.DispensingPointAttendant;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DailySalesRepository extends JpaRepository<DailySales, Long> {

//    public List<DailySales> findBySaleDateBetween(Date today, Date previousSalesDate);
//
//    @Query("SELECT SUM(o.quantity) FROM DailySales o WHERE o.saleDate < CURRENT_TIMESTAMP AND o.saleDate >:startDate")
//    public Double findTotalSalesFromPreviousSupplyToDate(@Param("name") Date startDate);
//
//    public DailySales findByDispensingPointAttendantAndSaleDate(DispensingPointAttendant dispensingPointAttendant, Date saleDate);
//
}
