package com.skk.common.service;

import com.skk.common.entity.BrandLargeType;
import com.skk.common.paging.LayuiPage;
import com.skk.common.paging.PagingResult;

import java.util.List;

/**
 * Created by lenovo on 2020/7/17.
 */
public interface BrandLargeTypeService {

    BrandLargeType getBrandLargeType(Long id);

    int saveBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeTypeByIds(Long[] ids);

    PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page);

    List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type);

}
