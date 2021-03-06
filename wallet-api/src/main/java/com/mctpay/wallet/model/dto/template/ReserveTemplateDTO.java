package com.mctpay.wallet.model.dto.template;

import cn.hutool.json.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "预定模板DTO")
public class ReserveTemplateDTO implements Serializable  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "预订者姓名")
    private Integer name;

    @ApiModelProperty(value = "模板名字")
    private String templateName;

    @ApiModelProperty(value = "手机号")
    private Integer phoneNmuber;

    @ApiModelProperty(value = "预约时间")
    private Integer reserveTime;

    @ApiModelProperty(value = "人数")
    private Integer userCount;

    @ApiModelProperty(value = "备注")
    private Integer comment;

    @ApiModelProperty(value = "是否需要定金")
    private Integer needDeposit;

    @ApiModelProperty(value = "定金金额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "是否需要图片")
    private Integer needPicture;

    @ApiModelProperty(value = "其余映射字段")
    private JSONObject dynamicField;
}
