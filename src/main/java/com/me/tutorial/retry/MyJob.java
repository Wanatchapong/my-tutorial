package com.me.tutorial.retry;

/**
 * Created by wanatchapong on 2/21/2017 AD.
 */
public class MyJob {

    private SimpleRetry<String> retry;

    public MyJob(SimpleRetry<String> retry) {
        this.retry = retry;
    }

    public String getSomething(String id) {
        return retry.run(() -> {
            System.out.println("Do something id : " + id);
            return id;
        });
    }
}
