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
 *
 * 权限，后台的菜单
 * @author example
 */
@Data
@TableName("sys_permission")
public class Permission  extends Model<Permission> implements Serializable {

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
     * 权限名称
     */
    private String name;

    /**
     * pid
     */
    private Long pid;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 请求URL
     */
    private String url;

    /**
     * 图标
     */
    private String icon;

    /**
     * 序号(越小越靠前)
     */
    private Double sort;

    /**
     * 级别
     */
    @TableField(exist = false)
    private Integer level;

    /**
     * 子权限列表
     */
    @TableField(exist = false)
    private List<Permission> childPermissions;

