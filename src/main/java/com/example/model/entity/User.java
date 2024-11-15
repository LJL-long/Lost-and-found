package com.example.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户登录表(User)实体类
 *
 * @author makejava
 * @since 2024-10-23 15:07:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户表")
public class User implements Serializable {
    private static final long serialVersionUID = -88416646392709686L;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

    /**
     * 用户图像
     */
    private String photo;
    /**
     * 个人简介
     */
    private String profile;
    /**
     * 身份 1 学生 2 老师
     */
    private Integer userRole;
    /**
     * 性别 1 男 2 女
     */
    private Integer sex;
    /**
     * 学院名
     */
    private String academy;

}

