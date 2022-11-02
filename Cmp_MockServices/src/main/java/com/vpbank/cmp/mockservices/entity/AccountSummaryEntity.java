package com.vpbank.cmp.mockservices.entity;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "account_summary")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class AccountSummaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="cif")
    private String cif;

    @Column(name = "account_summary",nullable = false, columnDefinition = "json")
    @Type(type = "json")
    private String accountSummary;
}
