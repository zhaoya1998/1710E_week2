package com.zhaoya.dao;

import java.util.ArrayList;
import java.util.List;

import com.zhaoya.domain.Goods;
import com.zhaoya.domain.Vo;

public interface GoodsMapper {

	ArrayList<Goods> getGoodslist(Vo vo);
	
	int insert(List<Goods> list);

}
