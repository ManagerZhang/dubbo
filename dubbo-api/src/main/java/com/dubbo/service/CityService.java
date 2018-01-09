package com.dubbo.service;

import com.dubbo.model.City;

/**
 * @author zhangke
 * @date 2018-01-09.
 */
public interface CityService {
	/**
	 * 查询城市信息
	 * @param cityName
	 * @return
	 */
	City selectCityByName(String cityName);
}
