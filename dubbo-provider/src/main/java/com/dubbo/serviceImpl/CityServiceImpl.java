package com.dubbo.serviceImpl;


import com.dubbo.dao.CityDao;
import com.dubbo.model.City;
import com.dubbo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangke
 * @date 2018-01-05
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
	@Autowired
	private CityDao cityDao;

	@Override
	public City selectCityByName(String cityName) {
		Map parameter = new HashMap(4);
		parameter.put("cityName",cityName);
		return cityDao.findCityByName(parameter);
	}
}
