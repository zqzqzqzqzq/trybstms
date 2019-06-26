/**  
 * @Title: MoneyAction.java
 * @Package com.bank.BSTMS.action
 * @author zhangbo
 * @date 2019年6月19日
 * @version V1.0  
 */
package com.bank.BSTMS.action;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: MoneyAction
 * @Description: 存取款业务操作
 * @author zhangqi
 * @date 2019年6月19日
 * @since JDK 1.8
 */
@Controller
public class MoneyAction {

	/**
	 * 
	 * @Title: index
	 * @Description: 初始化取款页面
	 * @return  String 取款页面
	 */
	@RequestMapping(value="gm",method=RequestMethod.GET)
	public String index() {
		return "gm";
	}
	
	/**
	 * 
	 * @Title: getMoney
	 * @Description:  取钱业务操作
	 * @param paramMap 金额
	 * @return 取钱操作状态信息
	 */
	@RequestMapping("getMoney")
	@ResponseBody
	public Map<String,String> getMoney(@RequestParam Map<String,String> paramMap){
		String v = paramMap.get("value");
		
		
		return paramMap;
		
	}
	
}
