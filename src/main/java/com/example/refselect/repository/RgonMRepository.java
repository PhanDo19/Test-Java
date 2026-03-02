package com.example.refselect.repository;

import com.example.refselect.entity.RgonM;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RgonMRepository extends JpaRepository<RgonM, String> {
    @Query("""
            select r from RgonM r
            where r.deleteFlg = '0'
              and r.rgonUseTyp = '1'
            order by r.dispOrder
            """)
    List<RgonM> findCoreRegions();
}
