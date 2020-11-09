package com.bzy.ad.controller;

import com.alibaba.fastjson.JSON;
import com.bzy.ad.annotation.IgnoreResponseAdvice;
import com.bzy.ad.exception.AdException;
import com.bzy.ad.vo.CommonResponse;
import com.bzy.ad.entity.AdPlan;
import com.bzy.ad.service.IAdPlanService;
import com.bzy.ad.vo.AdPlanGetRequest;
import com.bzy.ad.vo.AdPlanRequest;
import com.bzy.ad.vo.AdPlanResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@Slf4j
@RestController
@Api(tags = {"高性能查询类接口：天天推荐查询接口"})
public class AdPlanOPController {

    private final IAdPlanService adPlanService;

    @Autowired
    public AdPlanOPController(IAdPlanService adPlanService) {
        this.adPlanService = adPlanService;
    }

    @PostMapping("/create/adPlan")
    public AdPlanResponse createAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
        log.info("ad-sponsor: createAdPlan -> {}",
                JSON.toJSONString(request));
        return adPlanService.createAdPlan(request);
    }

    @PostMapping("/get/adPlan")
    public List<AdPlan> getAdPlanByIds(
            @RequestBody AdPlanGetRequest request) throws AdException {
        log.info("ad-sponsor: getAdPlanByIds -> {}",
                JSON.toJSONString(request));
        return adPlanService.getAdPlanByIds(request);
    }

    @PutMapping("/update/adPlan")
    public AdPlanResponse updateAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
        log.info("ad-sponsor: updateAdPlan -> {}",
                JSON.toJSONString(request));
        return adPlanService.updateAdPlan(request);
    }

    @DeleteMapping("/delete/adPlan")
    public void deleteAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
        log.info("ad-sponsor: deleteAdPlan -> {}",
                JSON.toJSONString(request));
        adPlanService.deleteAdPlan(request);
    }

    /**
     * 测试ResponseBodyAdvice拦截controller
     * @param id
     * @return
     */
    @GetMapping("/queryById")
    @IgnoreResponseAdvice
    public AdPlan queryById(@RequestParam("id")Long id){
        CommonResponse  a = new CommonResponse();
       return adPlanService.queryById(id);
    }

    @GetMapping("/exception")
    public AdPlan exception(@RequestParam("id")Long id) throws Exception {
        if(id>5){
            throw new AdException("mmmm");
        }
        return new AdPlan();
    }
}
