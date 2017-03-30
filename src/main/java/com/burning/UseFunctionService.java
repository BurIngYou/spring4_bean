package com.burning;

/**
 * @Description: TODO
 * @Author:You.Hu
 * @Create:2017-03-29 20:48
 */
public class UseFunctionService {

    private FunctionDao functionDao;

    //set方法
    public void setFunctionDao(FunctionDao functionDao) {

        this.functionDao = functionDao;
    }

    public String sayAction(String word){

        return functionDao.say(word);
    }
}
