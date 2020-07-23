package com.skk.common.paging;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class PagingResult<T> extends PageInfo<T>{

    private List<T> result;

    private long totalCount;

    public PagingResult(List<T> list){
        super(list);
    }


    public List<T> getResult() {
        return super.getList();
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public long getTotalCount() {
        return super.getTotal();
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
