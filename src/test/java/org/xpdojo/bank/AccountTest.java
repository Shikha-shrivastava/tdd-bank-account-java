package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void BalanceCheckAsZero(){
        Account account =new Account();
       assertThat(account.balance, is (0));
    }

@Test
public void depositAmountToIncreaseTheBalance() {
    assertThat("check deposite balance",
            true,
            is(false));

    }


}
