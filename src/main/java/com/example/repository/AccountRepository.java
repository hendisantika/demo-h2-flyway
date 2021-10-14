package com.example.repository;

import com.example.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-flyway
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 06.33
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
