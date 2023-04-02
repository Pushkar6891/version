package com.msdw.aps.msfspe.entity.fetcher.impl;

import com.msdw.aps.fsdataobject.data.models.Fund;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class FundFetcher {

    public Fund getById(String id) {
        if (StringUtils.isNotBlank(id))
            return new Fund();
        return null;
    }

}
