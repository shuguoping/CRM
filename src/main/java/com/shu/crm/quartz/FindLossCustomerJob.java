package com.shu.crm.quartz;

import javax.annotation.Resource;

import com.shu.crm.service.CustomerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 查找流失客户 定时任务
 * @author Administrator
 *
 */
@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService; // 客户Service

	/**
	 * 每天凌晨2点定期执行
	 */
	@Scheduled(cron="0 0 2 * * ?")
	public void work(){
		customerService.checkCustomerLoss();
	}
}
