package com.dkd.manage.domain.Vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

@Data
public class RegionVo extends Region {
    /** 节点数量 */
    private Integer nodeCount;
}
