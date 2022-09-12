package com.vpbank.cmp.mockservices.service;

public class Common {
    public static void getDelay() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 2000));
        return ;
    }
}
