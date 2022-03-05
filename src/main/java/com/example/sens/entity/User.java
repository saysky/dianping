package com.example.sens.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户或员工信息
 */
@Data
@TableName("sys_user")
public class User  extends Model<User> implements Serializable {

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
     * 角色ID
     */
    private Long roleId;

    /**
     * 账号
     */
    private String userName;

    /**
     * 用户名，网名
     */
    private String userDisplayName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 角色名称
     */
    @TableField(exist = false)
    private Role role;

}
