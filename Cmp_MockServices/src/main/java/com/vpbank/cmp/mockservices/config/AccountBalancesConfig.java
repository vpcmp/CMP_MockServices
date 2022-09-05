package com.vpbank.cmp.mockservices.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ConfigurationProperties("account-list")
@PropertySource(value = "classpath:account-data.yml", factory = YamlPropertySourceFactory.class)
@Getter
@Setter
public class AccountBalancesConfig {
    private List<AccountBalance> accountBalances;
    @Getter
    @Setter
    public static class AccountBalance {
        private String customerCode;
        private String accountNumber;
        private String openBalance;
        private String closeBalance;
        private String lockAmount;
    }
}
