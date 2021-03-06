package com.mctpay.manager.mapper.template;

import com.mctpay.common.base.mapper.BaseMapper;
import com.mctpay.manager.model.entity.template.ReserveTemplateEntity;
import com.mctpay.manager.model.param.ReserveTemplateParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author dongwei_guo
 * @date 2020-02-29 14:00:37
 */
@Repository
public interface ReserveTemplateMapper extends BaseMapper<ReserveTemplateEntity> {

    /**
     * @Description 插入数据
     * @Date 16:12 2020/3/21
     **/
    void insert(ReserveTemplateParam reserveTemplateParam);
    /**
     * @Description 插入数据
     * @Date 17:19 2020/04/26
     **/
    void updateReserveTemplate(ReserveTemplateParam reserveTemplateParam);
    /**
     * @Description
     * @Date 10:28 2020/04/28
     **/
    void deleteReserveTemplate(@Param("reserveTemplateId") Long reserveTemplateId , @Param("status") Integer  status, @Param("updateTime") Date updateTime);
    /**
     * @Description
     * @Date 11:12 2020/04/28
     **/
    List<ReserveTemplateEntity> listReserveTemplate();
}
