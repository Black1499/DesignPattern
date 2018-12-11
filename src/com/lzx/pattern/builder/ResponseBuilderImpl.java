package com.lzx.pattern.builder;

public class ResponseBuilderImpl<T> implements ResponseBuilder<T>{
    private ResponseVo<T> responseVo = new ResponseVo<>();

    public ResponseBuilderImpl(int code){
        responseVo.setCode(code);
    }

    public ResponseBuilderImpl(){}

    @Override
    public ResponseBuilder buildPage(int page) {
        responseVo.setCode(page);
        return this;
    }

    @Override
    public ResponseBuilder buildData(T data) {
        responseVo.setData(data);
        return this;
    }

    @Override
    public ResponseBuilder buildError(String error) {
        responseVo.setError(error);
        return null;
    }

    @Override
    public ResponseBuilder OK() {
        responseVo.setCode(200);
        return this;
    }

    @Override
    public ResponseBuilder OK(int page) {
        responseVo.setPage(page);
        return this.OK();
    }

    @Override
    public ResponseBuilder OK(int page, T data) {
        responseVo.setData(data);
        return this.OK(page);
    }

    @Override
    public ResponseBuilder Error() {
        responseVo.setCode(500);
        return this;
    }

    @Override
    public ResponseBuilder Error(String message) {
        responseVo.setError(message);
        return this.Error();
    }
}
