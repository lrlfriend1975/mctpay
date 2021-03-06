package com.mctpay.pos.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: guodongwei
 * @Description: 发送注册邮件参数
 * @Date: 2020/6/28 23:28
 */
@ApiModel("发送注册邮件参数")
@Data
public class SendFeedbackEmailParam {

	@NotNull
	@ApiModelProperty("邮件")
	private String email;

	@ApiModelProperty("语言类型：0中文，1英文")
	private Integer language;

	@NotNull
	@ApiModelProperty("反馈内容")
	private String content;
}
