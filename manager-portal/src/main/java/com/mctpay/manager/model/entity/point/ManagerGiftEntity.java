package com.mctpay.manager.model.entity.point;

import com.xtpay.common.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author dongwei_guo
 * @date 2020-02-23 18:23:01
 */
@Data
@ApiModel(value = "礼品")
public class ManagerGiftEntity  extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;
	/**
	 * 商品名称
	 */
	@ApiModelProperty(value = "商品名称")
	private String goodsName;
	/**
	 * 最大兑换数量
	 */
	@ApiModelProperty(value = "最大兑换数量")
	private Integer maxExchangeCount;

	 /**
	 * 商品类型码
	 */
	@ApiModelProperty(value = "商品类型码")
	private String goodsTypeCode;
	/**
	 * 商品类型名称
	 */
	@ApiModelProperty(value = "商品类型名称")
	private String goodsTypeName;
	/**
	 * 商品价值
	 */
	@ApiModelProperty(value = "商品价值")
	private BigDecimal goodsAmount;

	/**
	 * 兑换所需积分
	 */
	@ApiModelProperty(value = "兑换所需积分")
	private Integer exchangePoint;

}
