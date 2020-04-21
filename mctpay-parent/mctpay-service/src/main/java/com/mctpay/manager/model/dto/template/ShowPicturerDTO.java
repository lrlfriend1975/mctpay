package com.mctpay.manager.model.dto.template;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class ShowPicturerDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 图片用途类型码
     */
    @ApiModelProperty(value = "图片用途类型码")
    private String useTypeCode;
    /**
     * 图片用户态名称
     */
    @ApiModelProperty(value = "图片用户态名称")
    private String useTypeName;
    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址")
    private String address;
    /**
     * sdk类型
     */
    @ApiModelProperty(value = "sdk类型")
    private Integer sdkType;

}
