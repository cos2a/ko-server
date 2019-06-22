package org.ko.sigma.data.entity;

import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;
import java.io.Serializable;

/**
 * <p>菜单表，维度表</p>
 * @author K.O
 */
@Data
@TableName("t_menu")
public class Menu implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 菜单编码，由系统统一生成，不可修改
     */
    private String code;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单路由规则索引
     */
    private String path;

    /**
     * 命名视图组件
     */
    private String component;

    /**
     * 路由重定向
     */
    private String redirect;

    /**
     * 菜单元数据。 name: 路由名称，icon: 路由图标
     */
    private String metaJson;

    /**
     * 上级菜单编码，由系统统一生成，不可修改
     */
    private String parentCode;
}