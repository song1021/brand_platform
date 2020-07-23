package com.skk.common.service;


import com.skk.common.entity.BrandGnSmalltypeItem;
import com.skk.common.entity.vo.BrandGnSmalltypeItemVo;
import com.skk.common.paging.LayuiPage;
import com.skk.common.paging.PagingResult;

public interface BrandGnSmalltypeItemService {

    BrandGnSmalltypeItem getBrandGnSmalltypeItem(Long id);

    int saveBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem);

    int deleteBrandGnSmalltypeItem(BrandGnSmalltypeItem brandGnSmalltypeItem);

    int deleteBrandGnSmalltypeItemByIds(Long[] ids);

    PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItem(BrandGnSmalltypeItem item, LayuiPage page);

    PagingResult<BrandGnSmalltypeItem> findBrandGnSmalltypeItemList(BrandGnSmalltypeItemVo vo, LayuiPage page);
//    List<BrandGnSmalltypeItem> findBrandGnSmalltypeItemList(BrandGnSmalltypeItemVo vo, LayuiPage page);
}