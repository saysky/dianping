package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_store_comment)实体类
 *
 * @author saysky
 * @since 2022-02-26 12:39:38
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_store_comment")
public class StoreComment extends Model<StoreComment> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
	private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 店铺id
     */
    private Long storeId;
    /**
     * 评论描述
     */
    private String content;
    /**
     * 父评论id
     */
    private Long pid;
    /**
     * 店铺评分
     */
    private Integer score;
    /**
     * 服务评分
     */
    private Integer serviceScore;
    /**
     * 环境评分
     */
    private Integer environmentScore;
    /**
     * 口味评分
     */
    private Integer tasteScore;

    /**
     * 待审核0，已审核1，已回复2
     */
    private Integer status;

    private Date createTime;


    /**
     * 子评论
     */
    @TableField(exist = false)
    private List<StoreComment> childCommentList;

    @TableField(exist = false)
    private Store store;


    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private String scoreStr;

    public String getScoreStr() {
        if(score == null) {
            return "";
        }
        if (score == 1) {
            return "非常差";
        }
        if (score == 2) {
            return "较差";
        }
        if (score == 3) {
            return "中等";
        }
        if (score == 4) {
            return "较好";
        }
        if (score == 5) {
            return "非常好";
        }
        return "";
    }
