package me.flyray.pay.api;

import java.util.List;
import java.util.Map;

import me.flyray.pay.model.PayChannel;

/** 
* @author: bolei
* @date：2017年3月18日 下午11:20:09 
* @description：支付通道
*/

public interface PayChannelService {

	List<PayChannel> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(PayChannel payChannel);
	
	void update(PayChannel payChannel);
	
	void deleteBatch(Long[] ids);
}