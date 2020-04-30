package com.shu.crm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体
 *
 * @author Administrator
 */
@Data
@TableName("t_user")
public class User {
    @TableId("id")
    private Integer id; // 编号
    @TableField("userName")
    private String userName; // 用户名
    @TableField("password")
    private String password; // 密码
    @TableField("trueName")
    private String trueName; // 真实姓名
    @TableField("email")
    private String email; // 邮件
    @TableField("phone")
    private String phone; // 联系电话
    @TableField("roleName")
    private String roleName; // 角色名称 系统管理员 销售主管 客户经理 高管


}
