package com.mctpay.manager.model.entity.merchant;

import com.mctpay.common.base.entity.BaseEntity;
import com.mctpay.manager.model.entity.system.RoleEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.List;

/**
 * @author dongwei_guo
 * @date 2020-02-23 18:23:01
 */
@Data
@ApiModel(value = "商户平台用户")
public class MerchantUserEntity extends BaseEntity implements Serializable {
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
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 角色
     */
    @ApiModelProperty(value = "角色")
    private List<RoleEntity> roles;

}
