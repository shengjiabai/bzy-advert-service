package com.bzy.ad.search;


import com.bzy.ad.search.vo.SearchRequest;
import com.bzy.ad.search.vo.SearchResponse;


public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
