package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.pojo.BaseDict;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.service.BaseDictService;
import com.crm.service.CustomerService;
import com.crm.utils.Page;

@Controller
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService; 
	
	@Autowired
	private CustomerService customerService; 
	
	@Value("${fromType.code}")
	private String fromTypeCode;
	
	@RequestMapping(value = "/customer/list")
	public String list(QueryVo vo,Model model){
		
		List<BaseDict> fromType = baseDictService.selectBaseDictListByCode("002");
		List<BaseDict> industryType = baseDictService.selectBaseDictListByCode(fromTypeCode);
		List<BaseDict> levelType = baseDictService.selectBaseDictListByCode("006");
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		Page<Customer> page = customerService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		
		model.addAttribute("custName", vo.getCustName());
		model.addAttribute("custSource", vo.getCustSource());
		model.addAttribute("custIndustry", vo.getCustIndustry());
		model.addAttribute("custLevel", vo.getCustLevel());
		
		return "customer";
	}
	@RequestMapping(value = "/customer/edit.action")
	public @ResponseBody 
	Customer edit(Integer id,Model model){
				
		return customerService.selectCustomerById(id);
	}
	
	@RequestMapping(value = "/customer/update.action")
	public @ResponseBody 
	String update(Customer customer,Model model){
		customerService.updateCustomerById(customer);
		return "OK";
	}
	//删除
	@RequestMapping(value = "/customer/delete.action")
	public @ResponseBody 
	String delete(Integer id,Model model){
		customerService.deleteCustomerById(id);
		return "OK";
	}
	
	

}
