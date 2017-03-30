package com.burning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置类
 * @Author:You.Hu
 * @Create:2017-03-29 20:40
 */
@Configuration
public class Config {

    @Bean
    public FunctionDao getFunctionDao(){
        return new FunctionDao();
    }

    @Bean
    public UseFunctionService getUseFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        //将FunctionDao注入到UseFunctionService中
       useFunctionService.setFunctionDao(getFunctionDao());
        return useFunctionService;
    }
}
