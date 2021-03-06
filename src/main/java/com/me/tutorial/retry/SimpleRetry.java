package com.me.tutorial.retry;

import java.util.function.Supplier;

/**
 * Created by wanatchapong on 2/21/2017 AD.
 */
public class SimpleRetry<T> {

    private int retryCounter;

    private int maxRetries;

    public SimpleRetry(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public T run(Supplier<T> function) {
        try {
            return function.get();
        } catch (Exception ex) {
            return retry(function);
        }
    }

    public int getRetryCounter() {
        return retryCounter;
    }

    private T retry(Supplier<T> function) throws RuntimeException {
        System.out.println("FAILED, will be retried " + maxRetries + " times.");

        retryCounter = 0;
        while (retryCounter < maxRetries) {
            try {
                return function.get();
            } catch (Exception ex) {
                retryCounter++;
                System.out.println("FAILED on retry " + retryCounter + " of " + maxRetries + " error: " + ex);
                if (retryCounter >= maxRetries) {
                    System.out.println("Max retries exceeded.");
                    break;
                }
            }
        }

        throw new RuntimeException("Failed on all of " + maxRetries + " retries");
    }
}
