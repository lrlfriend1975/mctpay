package com.mctpay.manager.model.dto.point;

import com.mctpay.common.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dongwei_guo
 * @date 2020-06-05 10:04:21
 */
@Data
@ApiModel(value = "商户卡券兑换码")
public class CardRedeemCodeDTO extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "")
	private String id;

	@ApiModelProperty(value = "兑换码")
	private String redeemCode;

	@ApiModelProperty(value = "卡券id")
	private String cardId;

	@ApiModelProperty(value = "0未使用，1已经使用")
	private Integer used;

}
