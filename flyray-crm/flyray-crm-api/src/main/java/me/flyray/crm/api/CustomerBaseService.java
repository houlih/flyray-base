package me.flyray.crm.api;

import java.util.List;
import java.util.Map;

import me.flyray.common.service.BaseService;
import me.flyray.crm.model.CustomerBaseExtend;
import me.flyray.crm.model.CustomerBase;

/** 
* @author: bolei
* @date：2017年3月12日 下午4:48:44 
* @description：客户基本信息
*/

public interface CustomerBaseService extends BaseService{

	void save(CustomerBase customerBase);
	void updateExtent(CustomerBaseExtend extent);
	void saveExtend(CustomerBaseExtend extent);
	void deleteBaseAndExtend(Long id);
	void delete(Long id);
	CustomerBase queryByCustomerId(String customerId);
	CustomerBase queryByCustomerNo(String customerNo);
	
	public Map<String, Object> selectByCustomerId(Map<String, Object> map);
}
