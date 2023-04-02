package com.msdw.aps.msfspe.business.jpa.repositories;

import com.msdw.aps.msfspe.business.entity.InKindDistribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface InKindDistributionRepository extends JpaRepository<InKindDistribution, String> {

    List<InKindDistribution> findByDealingDateBetweenAndFundId(@Param("startDate") Date startDate,
                                                               @Param("endDate") Date endDate,
                                                               @Param("fundId") String fundId);

    List<InKindDistribution> findByOrderId(@Param("orderId") String orderId);
}
