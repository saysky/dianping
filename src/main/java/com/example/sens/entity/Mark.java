package com.example.sens.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * (biz_mark)实体类
 *
 * @author saysky
 * @since 2022-02-26 12:39:38
 * @description 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("biz_mark")
public class Mark extends Model<Mark> implements Serializable {
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
     * 业务类型：1店铺，2菜品
     */
    private Integer mainType;
    /**
     * 业务id
     */
    private Long mainId;

    /**
     * 收藏名称
     */
    private String mainName;
    /**
     * 创建时间
     */
    private Date createTime;


