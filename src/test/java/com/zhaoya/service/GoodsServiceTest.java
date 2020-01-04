package com.zhaoya.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaoya.common.untils.StreamUtil;
import com.zhaoya.common.untils.StringUtil;
import com.zhaoya.domain.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceTest {

	@Resource
	private GoodsService service;

	@Test
	public void testGetGoodsList() {
	}

	@Test
	public void testInsert() throws IOException {
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));

		ArrayList<Goods> arrayList = new ArrayList<Goods>();
		/*
		 * for (int i = 1; i < list.size(); i++) { Goods goods = new Goods(); String[] s
		 * = list.get(i).split("=="); if (StringUtil.isNumber(s[0])) {
		 * goods.setId(Integer.parseInt(s[0])); }
		 * 
		 * goods.setName(s[1]);
		 * 
		 * if (StringUtil.hasText(s[2])) { String price = s[2].substring(1); boolean c =
		 * StringUtil.isNumber(price); if (c) { goods.setPrice(Double.valueOf(price)); }
		 * }
		 * 
		 * if (s.length > 3) { if (StringUtil.hasText(s[3])) { String sales =
		 * s[3].substring(0, s[3].lastIndexOf("%"));
		 * 
		 * boolean b = StringUtil.isNumber(sales); if (b) {
		 * goods.setSales(Integer.valueOf(sales)); } else { goods.setSales(0); } } else
		 * { goods.setSales(0); } } arrayList.add(goods); }
		 */

		for (String str : list) {
			//System.out.println(str);
			Goods goods = new Goods();
			String[] s = str.split("==");
			if (StringUtil.isNumber(s[0])) {
				goods.setId(Integer.parseInt(s[0]));
			}

			goods.setName(s[1]);
			if (StringUtil.hasText(s[2])) {
				String price = s[2].substring(1);
				boolean c = StringUtil.isNumber(price);
				if (c) {
					goods.setPrice(Double.valueOf(price));
				}
			}

			if (s.length > 3) {
				if (StringUtil.hasText(s[3])) {
					String sales = s[3].substring(0, s[3].lastIndexOf("%"));

					boolean b = StringUtil.isNumber(sales);
					if (b) {
						goods.setSales(Integer.valueOf(sales));
					} else {
						goods.setSales(0);
					}
				} else {
					goods.setSales(0);
				}
			}
			arrayList.add(goods);
		}

		service.insert(arrayList);
	}

}
