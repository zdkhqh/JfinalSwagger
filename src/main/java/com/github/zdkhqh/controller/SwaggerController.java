package com.github.zdkhqh.controller;

import com.github.zdkhqh.config.SwaggerPlugin;
import com.jfinal.core.Controller;
import com.jfinal.kit.JsonKit;

/**
 * @author HeQuehua
 * @date 2019/4/27
 **/
public class SwaggerController extends Controller {

    public void api() {
        renderJson(JsonKit.toJson(SwaggerPlugin.getDoc(getPara("basePackage"))));
    }

    public void swagger_resources() {
        renderJson(JsonKit.toJson(SwaggerPlugin.getApiInfo()));
    }

}