package com.nf2.Formatters_dome.vo;

import com.github.pagehelper.Page;

import java.util.ArrayList;

public class TestResultVo {
    public static void main(String[] args) {

        ResultVo resultVo1 = ResultVo.ok("正常返回");
        ResultVo resultVo = new ResultVo();
        ArrayList<ErrorDetail> list = new ArrayList<>();
        resultVo.setErrors(list);

        ResultVo resultVo2 = ResultVo
               .err(555,"错误信息");
        System.out.println(resultVo2);


    }
}
