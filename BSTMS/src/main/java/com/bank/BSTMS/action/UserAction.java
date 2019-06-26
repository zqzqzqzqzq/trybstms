package com.bank.BSTMS.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bank.BSTMS.pojo.BCardInfo;
import com.bank.BSTMS.svc.BCardInfoSvc;

@Controller
public class UserAction {
	
	@Autowired
	private BCardInfoSvc bcardInfoSvc;
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		request.setAttribute("key", "Sd");
		return "login";
	}
	
	@RequestMapping("getUser")
	public String getUser(@RequestParam String username,@RequestParam String password ,HttpSession session) {
		//正则验证，以1-9开头，16位数字
		Pattern p = Pattern.compile("[1-9][0-9]{15}");
		Matcher m = p.matcher(username);
		boolean flag = m.matches();
		
		//验证身份是否有效，true：验证成功(进入主页)，false:验证失败（登录页面）
		BCardInfo cardInfo = null;
		String page = "";
		if(flag) {
			//有效性
			cardInfo = bcardInfoSvc.getCardById(username);
			//TODU 验证用户是否存在 true:main,false:login
			session.setAttribute("user", cardInfo);
			page = "main";
		}else{
			session.setAttribute("error", "格式不正确");
			page = "login";
		}
			
		return page;
	}
}
