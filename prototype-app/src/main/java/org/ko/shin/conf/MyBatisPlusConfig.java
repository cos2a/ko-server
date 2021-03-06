package org.ko.prototype.conf;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.ko.prototype.util.SessionHolder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@MapperScan(basePackages = "org.ko.sigma.rest.*.repository")
public class MyBatisPlusConfig implements MetaObjectHandler {

    private static final String CREATE_USER = "createUser";
    private static final String GMT_CREATE = "gmtCreate";
    private static final String MODIFIED_USER = "modifiedUser";
    private static final String GMT_MODIFIED = "gmtModified";

    /**
     * Mybatis分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        page.setCountSqlParser(new JsqlParserCountOptimize());
        return page;
    }

    @Override
    public void insertFill(MetaObject metaObject) {
        var userDTO = SessionHolder.loginUser();
        if (userDTO != null) {
            this.setFieldValByName(CREATE_USER, userDTO.getId(), metaObject);
        }
        this.setFieldValByName(GMT_CREATE, new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        var userDTO = SessionHolder.loginUser();
        if (userDTO != null) {
            this.setFieldValByName(MODIFIED_USER, userDTO.getId(), metaObject);
        }
        this.setFieldValByName(GMT_MODIFIED, new Date(), metaObject);
    }
}
