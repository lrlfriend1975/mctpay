package com.mctpay.pos.model.param;

import com.mctpay.common.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dongwei_guo
 * @date 2020-06-15 14:11:39
 */
@Data
@ApiModel(value = "pos 支付校验")
public class PayCheckParam extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "校验字符串")
	private String checkStr;

	@ApiModelProperty(value = "交易单号")
	private String tradeNo;

}
