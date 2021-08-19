package com.sbrf.reboot;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public abstract class AccUtil {
    Set<Account> accounts;

    public Set<Account> getAllAccountsByClientId(long l) {
        Set<Account> accSet = new HashSet<>();
        for (Account a: accounts) {
            if (a.getId()==l) {
                accSet.add(a);
            }
        }
        return accSet;
    }
}
