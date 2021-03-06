package com.info.infoService.service;

import java.util.List;

import com.info.infoService.model.Info;

public interface InfoService {
	public List<Info> getInfosList();
	
	public void saveInfo(Info info);
	
	public List<Info> getInfosByColumn(String columnId);

	/**
	 * 获取最新的信息 
	 */
	public List<Info> getCurrentInfos();
}
