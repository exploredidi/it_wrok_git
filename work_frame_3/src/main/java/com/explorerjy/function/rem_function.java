package com.explorerjy.function;

/**
 * @Author: WenJianC
 * @Date: 2021/11/1 10:28
 * 除法运算，因为只是demo，就不再处理除数为0的bug~
 */
public class rem_function {

    public rem_function(){

    }

    //两个double类型的数字进行除法运算并返回double类型结果
    public Double RemDouble(double num1,double num2){
        return num1 / num2;
    }

    //两个double类型的数字进行除法运算并返回double类型结果
    public Double RemDouble(double num1,double num2,double num3){
        return (num1 / num2) / num3;
    }


}
