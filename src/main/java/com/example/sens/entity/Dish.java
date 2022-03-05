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
 * (biz_dish)实体类
 *
 * @author saysky
 * @since 2022-02-26 12:39:38
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_dish")
public class Dish extends Model<Dish> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 店铺id
     */
    private Long storeId;
    /**
     * 菜品名称
     */
    private String name;
    /**
     * 菜品图片
     */
    private String photo;
    /**
     * 菜品描述
     */
    private String content;

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

    @TableField(exist = false)
    private Store store;

}