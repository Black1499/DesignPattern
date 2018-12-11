package com.lzx.pattern.builder;

public class ResponseVo<T> {

    int code;
    int page;
    T data;
    String error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    private static ResponseBuilderImpl<Object> builder = new ResponseBuilderImpl<>();

    public static void OK() {
        builder.OK();
    }

    public static void OK(int page) {
        builder.OK(page);
    }

    public static <T> void OK(int page, T data) {
        builder.OK(page, data);
    }

    public static void Error() {
        builder.Error();
    }

    public static void Error(String message) {
        builder.Error(message);
    }

    public static ResponseBuilder buildCode(int code) {
        return new ResponseBuilderImpl(code);
    }

}
