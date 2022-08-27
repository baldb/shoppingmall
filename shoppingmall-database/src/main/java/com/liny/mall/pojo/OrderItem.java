package com.liny.mall.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 订单项/快照 
 * @TableName order_item
 */
@TableName(value ="order_item")
@Data
public class OrderItem implements Serializable {
    /**
     * 订单项ID
     */
    @TableId
    private String itemId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品图片
     */
    private String productImg;

    /**
     * skuID
     */
    private String skuId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    private Integer buyCounts;

    /**
     * 商品总金额
     */
    private BigDecimal totalAmount;

    /**
     * 加入购物车时间
     */
    private Date basketDate;

    /**
     * 购买时间
     */
    private Date buyTime;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    private Integer isComment;

    /**
     * 0 正常 1 已被删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}