package com.liny.mall.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 用户 
 * @TableName users
 */
@TableName(value ="users")
@Data
@ApiModel(value = "Users对象",description = "用户/买家信息")
public class Users implements Serializable {
    /**
     * 主键id 用户id
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 账号状态  0 正常 1 冻结
     */
    private Integer status;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    private String realname;

    /**
     * 头像 头像
     */
    private String userImg;

    /**
     * 手机号 手机号
     */
    private String userMobile;

    /**
     * 邮箱地址 邮箱地址
     */
    private String userEmail;

    /**
     * 性别 M(男) or F(女)
     */
    private String userSex;

    /**
     * 生日 生日
     */
    private Date userBirth;

    /**
     * 注册时间 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 0 正常 1 已被删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}