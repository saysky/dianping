package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_store)实体类
 *
 * @author saysky
 * @since 2022-02-26 12:39:38
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_store")
public class Store extends Model<Store> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 店铺名称
     */
    private String name;
    /**
     * 店铺图片
     */
    private String photo;
    /**
     * 负责人姓名
     */
    private String businessName;
    /**
     * 负责人电话
     */
    private String businessPhone;
    /**
     * 负责人的账号id
     */
    private Long businessUserId;

    /**
     * 营销推荐，1推荐，0不推荐
     */
    private Integer adRecommend;

    /**
     * 点击数
     */
    private Integer viewSize;

    /**
     * 点击数
     */
    private Integer commentSize;

    /**
     * 店铺评分
     */
    private Double score;
    /**
     * 服务评分
     */
    private Double serviceScore;
    /**
     * 环境评分
     */
    private Double environmentScore;
    /**
     * 口味评分
     */
    private Double tasteScore;

    /**
     * 地址
     */
    private String address;


    @TableField(exist = false)
    private User user;


}