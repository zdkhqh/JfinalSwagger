package com.github.zdkhqh.model;

/**
 * @author HeQuehua
 * @date 2019/4/27
 */
public class SwaggerSchema {
    private String $ref;

    public SwaggerSchema(String $ref) {
        this.$ref = $ref;
    }

    public String get$ref() {
        return $ref;
    }

    public void set$ref(String $ref) {
        this.$ref = $ref;
    }
}
