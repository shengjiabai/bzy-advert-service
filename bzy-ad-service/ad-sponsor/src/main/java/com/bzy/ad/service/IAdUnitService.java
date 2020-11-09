package com.bzy.ad.service;


import com.bzy.ad.exception.AdException;
import com.bzy.ad.vo.AdUnitDistrictRequest;
import com.bzy.ad.vo.AdUnitDistrictResponse;
import com.bzy.ad.vo.AdUnitItRequest;
import com.bzy.ad.vo.AdUnitItResponse;
import com.bzy.ad.vo.AdUnitKeywordRequest;
import com.bzy.ad.vo.AdUnitKeywordResponse;
import com.bzy.ad.vo.AdUnitRequest;
import com.bzy.ad.vo.AdUnitResponse;
import com.bzy.ad.vo.CreativeUnitRequest;
import com.bzy.ad.vo.CreativeUnitResponse;

public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
