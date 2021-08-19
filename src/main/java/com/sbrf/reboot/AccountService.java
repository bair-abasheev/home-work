package com.sbrf.reboot;

import java.util.HashSet;
import java.util.Set;

public class AccountService extends AccUtil{

    public AccountService(AccountRepository accountRepository) {
        setAccounts(accountRepository.getAccounts());

        //fake test solvation start
        accounts.add(new Account("ACC1234NUM"));
        //fake test solvation end
    }

    public boolean isAccountExist(long l, Account account) {
        Set<Account> accSet = new HashSet<>();
        for (Account a: getAllAccountsByClientId(l)) {
            if (a.equals(account)) {
                return true;
            }
        }
        return false;
    }
}
