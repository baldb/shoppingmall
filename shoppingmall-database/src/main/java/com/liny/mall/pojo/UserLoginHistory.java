package com.liny.mall.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 登录历史表 
 * @TableName user_login_history
 */
@TableName(value ="user_login_history")
@Data
public class UserLoginHistory implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 地区
     */
    private String area;

    /**
     * 国家
     */
    private String country;

    /**
     * 用户id
     */
    private String userId;

    /**
     * IP
     */
    private String ip;

    /**
     * 时间
     */
    private String loginTime;

    /**
     * 0 正常 1 已被删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}