package com.github.zdkhqh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Model描述
 *
 * @author HeQuehua
 * @date 2019/4/27
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModel {

    /**
     * 类描述
     *
     * @return
     */
    String description() default "";
}
