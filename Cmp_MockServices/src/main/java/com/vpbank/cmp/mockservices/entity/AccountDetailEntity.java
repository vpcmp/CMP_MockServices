package com.vpbank.cmp.mockservices.entity;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Table(name = "account_detail")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class AccountDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="account_number")
    private String accountNumber;

    @Column(name = "detail",nullable = false, columnDefinition = "json")
    @Type(type = "json")
    private String detail;
}
