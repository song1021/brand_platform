package com.skk.common.service;


import com.skk.common.entity.BrandSmallType;
import com.skk.common.paging.LayuiPage;
import com.skk.common.paging.PagingResult;

import java.util.List;

public interface BrandSmallTypeService {

	BrandSmallType getBrandSmallType(String smallNo);

	BrandSmallType getBrandSmallType(Long SmallTypeId);

	int saveBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallTypeByIds(Long[] ids);

	PagingResult<BrandSmallType> findBrandSmallType(BrandSmallType brandSmallType, LayuiPage page);

	List<BrandSmallType> findBrandSmallTypeList(BrandSmallType brandSmallType);
}