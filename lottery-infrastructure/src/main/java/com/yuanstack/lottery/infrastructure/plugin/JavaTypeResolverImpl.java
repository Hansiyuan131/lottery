package com.yuanstack.lottery.infrastructure.plugin;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * @description: Java类型解析
 * @author: hansiyuan
 * @date: 2022/4/12 10:39 PM
 */
public class JavaTypeResolverImpl extends JavaTypeResolverDefaultImpl {

    public JavaTypeResolverImpl() {
        super();

        //$NON-NLS-1$
        super.typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT",
                new FullyQualifiedJavaType(Integer.class.getName())));
        
        //$NON-NLS-1$
        super.typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT",
                new FullyQualifiedJavaType(Integer.class.getName())));
    }
}