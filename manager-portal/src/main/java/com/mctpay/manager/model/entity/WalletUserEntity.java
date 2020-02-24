package com.mctpay.manager.model.entity;

import com.xtpay.common.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dongwei_guo
 * @date 2020-02-23 18:22:59
 */
@Data
@ApiModel(value = "app端用户")
public class WalletUserEntity  extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "")
	private Long id;
	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名")
	private String username;
	/**
	 * 昵称
	 */
	@ApiModelProperty(value = "昵称")
	private String nickname;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;
	/**
	 * 性别
	 */
	@ApiModelProperty(value = "性别")
	private Integer gender;
	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String phoneNumber;
	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱")
	private String email;
	/**
	 * 积分
	 */
	@ApiModelProperty(value = "积分")
	private Integer point;
	/**
	 * 头像地址
	 */
	@ApiModelProperty(value = "头像地址")
	private String headpictureUrl;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;

}
