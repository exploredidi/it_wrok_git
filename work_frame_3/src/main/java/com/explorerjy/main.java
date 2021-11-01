package com.explorerjy;
import com.explorerjy.function.*;

/**
 * @Author: WenJianC
 * @Date: 2021/11/1 9:45
 */
public class main {
    public static void main(String[] args) {

        add_function add_function_1 = new add_function();

        System.out.println(add_function_1.AddDouble(100.0,100.0));
        System.out.println(add_function_1.AddDouble(100.0,100.0,100.0));

        dec_function dec_function_1 = new dec_function();
        System.out.println(dec_function_1.DecDouble(100.00,200.00));
        System.out.println(dec_function_1.DecDouble(100.00,200.00,300.00));

        mul_function mul_function_1 = new mul_function();
        System.out.println(mul_function_1.MulDouble(100.00,200.00));
        System.out.println(mul_function_1.MulDouble(100.00,200.00,300.00));

        rem_function rem_function_1 = new rem_function();
        System.out.println(rem_function_1.RemDouble(100.00,200.00));
        System.out.println(rem_function_1.RemDouble(100.00,200.00,300.00));

    }
}
