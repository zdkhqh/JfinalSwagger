package com.github.zdkhqh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 接口请求参数
 *
 * @author HeQuehua
 * @date 2019/4/27
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiRequests {
    Class<?> request() default Void.class;
}
