package com.sbrf.reboot;

import lombok.Data;

@Data
public class Account {

    private long id;//clientId
    private String accNum;

    public Account(String s) {
        this.accNum = s;
        id = 1L;
    }


}
