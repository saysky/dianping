package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author example
 */
@Data
@TableName("sys_role")
public class Role   extends Model<Role> implements Serializable  {

    /**
     * ID，自动生成
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 角色名称：admin，user
     */
    private String role;

    /**
     * 描述：管理员，用户
     */
    private String description;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 用户注册默认角色
     */
    private Integer isRegisterDefault;

    /**
     * 该角色对应的用户数量，非数据库字段
     */
    @TableField(exist = false)
    private Integer count;

    /**
     * 当前角色的权限列表
     */
    @TableField(exist = false)
    private List<Permission> permissions;

}