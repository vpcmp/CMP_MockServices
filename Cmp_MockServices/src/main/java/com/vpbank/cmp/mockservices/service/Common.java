package com.vpbank.cmp.mockservices.service;

public class Common {
    public static void Delay() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 2000));
        return ;
    }
}
