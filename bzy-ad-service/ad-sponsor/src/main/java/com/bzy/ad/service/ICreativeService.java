package com.bzy.ad.service;

import com.bzy.ad.vo.CreativeRequest;
import com.bzy.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
