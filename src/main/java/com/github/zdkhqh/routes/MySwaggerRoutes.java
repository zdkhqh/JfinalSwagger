package com.github.zdkhqh.routes;

import com.github.zdkhqh.controller.SwaggerController;
import com.jfinal.config.Routes;

/**
 * @author HeQuehua
 * @date 2019/4/27
 **/
public class MySwaggerRoutes extends Routes {
    @Override
    public void config() {
        add("/swagger", SwaggerController.class, "/");
    }
}
