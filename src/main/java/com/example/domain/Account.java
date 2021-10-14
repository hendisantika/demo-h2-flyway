package com.example.domain;

import com.example.domain.enumerate.AccountStatus;
import com.example.domain.enumerate.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-flyway
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 06.31
 */
@Entity
@Table(name = "account", schema = "account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "login_id")
    public String loginId;

    @Column(name = "login_name")
    public String loginName;

    @Column(name = "account_status")
    @Enumerated(EnumType.STRING)
    public AccountStatus status;

    @Enumerated(EnumType.STRING)
    public AccountType type;

    public Account(String loginId, String loginName, AccountStatus status, AccountType type) {
        this.loginId = loginId;
        this.loginName = loginName;
        this.status = status;
        this.type = type;
    }
}
