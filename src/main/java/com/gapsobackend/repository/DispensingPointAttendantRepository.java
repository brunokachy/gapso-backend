package com.gapsobackend.repository;

import com.gapsobackend.persistence.entity.DispensingPointAttendant;
import com.gapsobackend.persistence.entity.ProductDispensingPoint;
import com.gapsobackend.persistence.entity.Station;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispensingPointAttendantRepository extends JpaRepository<DispensingPointAttendant, Long> {

//    public DispensingPointAttendant findByProductDispensingPointAndActive(ProductDispensingPoint dispensingPoint, boolean active);
//
//    public List<DispensingPointAttendant> findByProductDispensingPointStationAndActive(Station station, boolean active);
//    
//    

}
