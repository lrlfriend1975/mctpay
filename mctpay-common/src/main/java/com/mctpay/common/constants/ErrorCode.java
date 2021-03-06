package com.mctpay.common.constants;

/**
 * @Author: guodongwei
 * @Description: 错误码，用于全局异常控制
 * @Date: 2020/2/24 15:01
 */
public enum ErrorCode {
    /**
     * 账号错误
     */
    ERROR(5000, "error"),
    /**
     * 未进行身份验证
     */
    NON_AUTHENTICATION(3000, "non_authentication"),
    ACCOUNT_FROZEN(3001, "account_frozen"),
    USERNAME_OR_PASSWORD_ERR(3002, "username_or_password_err"),
    /**
     * 邮箱已经被使用
     */
    EMAIL_HAS_BEEN_USED(3003, "email_has_been_used"),
    /**
     * 手机号已经被使用
     */
    PHONENUM_HAS_BEEN_USED(3004, " phonenum_has_been_used"),
    /**
     * 用户名已经被使用
     */
    USERNAME_HAS_BEEN_USED(3005, " username_has_been_used"),

    /**
     * 会员等级名称已经被使用
     */
    LEVELNAME_HAS_BEEN_USED(3006, " levelname_has_been_used"),
    /**
     * 积分已经被设置
     */
    POINT_HAS_BEEN_USED(3007, " point_has_been_used"),

    /**
     * 验证码输入错误
     */
    EMAILCODE_NOT_CORRECT(3008, "emailcode_not_correct"),

    /**
     * 验证码已过期
     */
    EMAILCODE_HAS_EXPIRED(3009, "emailcode_has_expired"),

    /**
     * 文件格式不支持
     */
    FILE_FORMAT_NOT_CORRECT(3010, "file_format_not_correct"),

    /**
     * 参数验证错误
     */
    ARGUMENTS_VALIDATE_FAIL(3011, "arguments_validate_fail"),

    /**
     * 静态收款获取失败
     */
    GET_COLLECTION_QRCODE_FAIL(3012, "get_collection_qrcode_fail"),

    /**
     * 扫码收款失败
     */
    SWEEP_COLLECT_FIAL(3013, "sweep_collect_fial"),

    /**
     * 订单不存在
     */
    ORDER_NOT_EXIST(3014, "order_not_exist"),

    CARD_CANT_RECEIVE(3015, "card_cant_receive"),

    CARD_NOT_EXIST_OR_HAS_BEEN_USED(3016, "card_not_exist_or_has_been_used"),

    SMS_SEND_FAIL(3017, "sms_send_fail"),

    /**
     * 短信验证码输入错误
     */
    SMSCODE_NOT_CORRECT(3018, "smscode_not_correct"),

    /**
     * 短信验证码已过期
     */
    SMSCODE_HAS_EXPIRED(3019, "smscode_has_expired"),

    /**
     * 用户没有注册
     */
    USER_NOT_REG(3020 , "找不到输入的用户");

    private int code;
    private String message;

    ErrorCode() {
    }

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    }
