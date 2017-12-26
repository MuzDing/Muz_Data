package com.crm.service;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.utils.Page;

public interface CustomerService {

	public Page<Customer> selectPageByQueryVo(QueryVo vo);
	
	//查询
	public Customer selectCustomerById(Integer id);
	
	//修改
	public void updateCustomerById(Customer customer);
	//删除
	public void deleteCustomerById(Integer id);
}
