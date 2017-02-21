package com.taotao.search.mapper;

import java.util.List;

import com.taotao.search.pojo.Item;

public interface ItemMapper {
	public List<Item> getItemList();
	
	public Item getItemById(String id);
}
