package com.github.zdkhqh.model;

/**
 * @author HeQuehua
 * @date 2019/4/27
 */
public class SwaggerResponse {

    private String description;

    private SwaggerSchema schema;

    public SwaggerResponse(String description, SwaggerSchema schema) {
        this.description = description;
        this.schema = schema;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SwaggerSchema getSchema() {
        return schema;
    }

    public void setSchema(SwaggerSchema schema) {
        this.schema = schema;
    }

}
