package com.msdw.aps.msfspe.entity.fetcher.impl;

import com.msdw.aps.fsdataobject.data.models.Investor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class InvestorFetcher {

    public Investor getById(String investorId) {
        if (StringUtils.isNotBlank(investorId))
            return new Investor();
        return null;
    }

}
