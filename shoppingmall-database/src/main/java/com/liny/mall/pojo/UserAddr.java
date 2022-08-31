package com.liny.mall.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户地址 
 * @TableName user_addr
 */
@TableName(value ="user_addr")
@Data
public class UserAddr implements Serializable {
    /**
     * 地址主键id
     */
    @TableId
    private String addrId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 收件人姓名
     */
    private String receiverName;

    /**
     * 收件人手机号
     */
    private String receiverMobile;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 状态,1正常，0无效
     */
    private Integer status;

    /**
     * 是否默认地址 1是 1:是  0:否
     */
    private Integer commonAddr;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 0 正常 1 已被删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}