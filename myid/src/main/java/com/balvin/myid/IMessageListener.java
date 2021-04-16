package com.balvin.myid;

public interface IMessageListener<T> {

    public void onSuccess(T responseMessage);

    public void onFailure(String errorResponseMessage);

}
