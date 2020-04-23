package com.mctpay.manager.mapper.merchantuser;

import com.mctpay.common.base.mapper.BaseMapper;
import com.mctpay.manager.model.dto.merchantuser.ListMerchantUserByInputReqDtO;
import com.mctpay.manager.model.entity.merchantuser.MerchantUserEntity;
import com.mctpay.manager.model.param.MerchantUserParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: guodongwei
 * @Description: 商户账户mapper
 * @Date: 2020/3/3 16:35
 */
@Repository
public interface MerchantUserMapper extends BaseMapper<MerchantUserEntity> , Mapper<MerchantUserEntity> {

    /**
     * @Description 注册管理员
     * @Date 20:45 2020/2/24
     **/
    void insertUser(MerchantUserParam merchantUserParam);

    /**
     * @Description 判断邮箱是否被使用
     * @Date 21:07 2020/2/24
     **/
    Integer countEmail(String email);

    /**
     * @Description 判断手机号是否被使用
     * @Date 21:07 2020/2/24
     **/
    Integer countPhoneNumber(String phoneNumber);

    /**
     * @Description 激活冻结用户
     * @Date 21:34 2020/2/25
     **/
    void updateSwitchUser(@Param("userId") String userId, @Param("state") Integer state);

    /**
     * @Description 跟新用户昵称
     * @Date 23:10 2020/3/3
     **/
    void updateUserNickName(@Param("nickName") String nickName, @Param("id") String id);

    /**
     * @Description 充值密码
     * @Date 23:10 2020/3/3
     **/
    void updatePassword(@Param("password") String password, @Param("id") String id);

     /**
      * 查询指定商户管理员信息
      * @param listMerchantUserByInputReqDtO
      * @return
      */
     public List<MerchantUserEntity> findPageByMerchantId(ListMerchantUserByInputReqDtO listMerchantUserByInputReqDtO);
}