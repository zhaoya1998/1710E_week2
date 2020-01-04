package com.zhaoya.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoya.dao.GoodsMapper;
import com.zhaoya.domain.Goods;
import com.zhaoya.domain.Vo;
import com.zhaoya.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
	private GoodsMapper mapper;
	public PageInfo<Goods> getGoodsList(Vo vo, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 10);
		ArrayList<Goods> goods=mapper.getGoodslist(vo);
		PageInfo<Goods> info=new PageInfo<Goods>(goods);
		return info;
	}
	public int insert(List<Goods> list) {
		// TODO Auto-generated method stub
		return mapper.insert(list);
	}

}
