package com.explorerjy.function;

/**
 * @Author: WenJianC
 * @Date: 2021/11/1 10:26
 *
 * 乘法运算，因为只是demo，就不再处理溢出的bug~
 */
public class mul_function {

    public mul_function(){

    }

    //两个double类型的数字进行乘法运算并返回double类型结果
    public Double MulDouble(double num1,double num2){
        return num1 * num2;
    }

    //三个double类型的数字进行乘法运算并返回double类型结果
    public Double MulDouble(double num1,double num2,double num3){
        return num1 * num3 * num2;
    }

}

