package com.zhaoya.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhaoya.domain.Goods;
import com.zhaoya.domain.Vo;

public interface GoodsService {

	PageInfo<Goods> getGoodsList(Vo vo, int pageNum);

	int insert(List<Goods> list);
}
