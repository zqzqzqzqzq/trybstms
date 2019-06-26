/**  
 * @Title: CardInfoSvc.java
 * @Package com.bank.BSTMS.svc
 * @author daluosi
 * @date 2019年6月19日
 * @version V1.0  
 */
package com.bank.BSTMS.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BSTMS.mapper.BCardInfoMapper;
import com.bank.BSTMS.pojo.BCardInfo;


/**
 * @ClassName: CardInfoSvc
 * @Description:  卡信息服务
 * @author zhangqi
 * @date 2019年6月19日
 * @since JDK 1.8
 */
@Service
public class BCardInfoSvc {

	/**
	 * 银行卡信息mapper依赖
	 */
	@Autowired
	private BCardInfoMapper bcardInfoMapper;
	
	public BCardInfo getCardById(String userID) {
		return bcardInfoMapper.selectByPrimaryKey(userID);
	}
	
	
}
