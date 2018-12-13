package com.nf2.Formatters_dome.vo;

import com.github.pagehelper.Page;

import java.util.ArrayList;
import java.util.List;

public class ResultVo<T> {
    private int code; //错误编码
    private String errMsg; //错误信息
    private T data; //数据
    private Page<T> pager;//分页信息

    private List<ErrorDetail> errors;
    private long dataTimestamp; //时间戳


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page<T> getPager() {
        return pager;
    }

    public void setPager(Page<T> pager) {
        this.pager = pager;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }

    public long getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(long dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    //========================================================================================================================
    //director
    public static ResultBuilder status(int code) {
        ResultBuilder builder = new DefaultBuilder<>();
        builder.status(code);
        return builder;
    }

    public static ResultBuilder addError(String type, String message) {
        ResultBuilder builder = new DefaultBuilder<>();
        builder.addError(type, message);
        return builder;
    }

    public static ResultVo ok(Object data) {
        ResultBuilder builder = new DefaultBuilder<>();
        return builder.data(data);
    }

    public static ResultVo ok(Object data, Page pager) {
        ResultBuilder builder = new DefaultBuilder<>();
        return builder.data(data);
    }

    public static ResultVo err(int code, String errMsg) {
        ResultBuilder builder = new DefaultBuilder<>();
        return builder.data(code,errMsg);
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                ", pager=" + pager +
                ", errors=" + errors +
                ", dataTimestamp=" + dataTimestamp +
                '}';
    }


    //========================================================================================================================
    //函数的类型签名
    public interface ResultBuilder<T> {
        ResultBuilder addError(String type, String message);

        ResultBuilder status(int status);

        ResultVo<T> data(T data);

        ResultVo<T> data(int status, T data);

        ResultVo<T> err(int status);

        ResultVo<T> err(int status, String emsg);
    }

    //========================================================================================================================
    public static class DefaultBuilder<T> implements ResultBuilder<T> {
        private ResultVo<T> resultVo;

        public DefaultBuilder() {
            this.resultVo = new ResultVo<T>();
        }

        @Override
        public ResultBuilder addError(String type, String message) {
            if (resultVo.getErrors() == null) {
                resultVo.setErrors(new ArrayList<>());
            }
            ErrorDetail detail = new ErrorDetail();
            detail.setType(type);
            detail.setMessage(message);
            return this;
        }

        @Override
        public ResultBuilder status(int status) {
            resultVo.setCode(status);
            return this;
        }

        @Override
        public ResultVo<T> data(T data) {
            resultVo.setData(data);
            return resultVo;
        }

        @Override
        public ResultVo<T> data(int status, T data) {
            this.status(status);
            resultVo.setData(data);
            return resultVo;
        }

        @Override
        public ResultVo<T> err(int status) {
            return null;
        }

        @Override
        public ResultVo<T> err(int status, String emsg) {
            this.status(status);
            resultVo.setErrMsg(emsg);
            return resultVo;
        }
    }
}


//========================================================================================================================
class ErrorDetail {
    private String type;
    private String message;

    public ErrorDetail() {
    }

    public ErrorDetail(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
