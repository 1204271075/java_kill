package com.jiangjie.kill.server.service;

import com.jiangjie.kill.model.entity.ItemKill;

import java.util.List;


public interface IItemService {

    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;
}
