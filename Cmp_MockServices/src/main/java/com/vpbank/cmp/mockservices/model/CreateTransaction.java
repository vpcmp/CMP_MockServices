package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTransaction {
    private String userId;
    private String transactionId;
    private int transactionTypeId;
    private String transactionData;
    private int isOnline;
    private int sPush;
    private NotificationInfo notificationInfo;
    private int eSignerTypeId;
    private int channelId;
    }
class NotificationInfo {
    private String title = "Vui long xac nhan giao dich";
    private String body = "QK dang thuc hien giao dich tren VPBank Online. Vui long xac nhan giao dich.";
}
