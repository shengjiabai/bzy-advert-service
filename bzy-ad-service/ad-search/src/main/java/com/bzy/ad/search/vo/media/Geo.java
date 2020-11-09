package com.bzy.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geo {

    private Float latitude;//维度
    private Float longitude;//精度

    private String city;
    private String province;
}
