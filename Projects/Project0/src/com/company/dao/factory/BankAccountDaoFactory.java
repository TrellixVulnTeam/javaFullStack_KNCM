package com.company.dao.factory;

import com.company.dao.BankAccountDao;
import com.company.daoImpl.BankAccountDaoImpl;

public class BankAccountDaoFactory {

    private static BankAccountDao dao;

    private BankAccountDaoFactory(){

    }
    public static BankAccountDao getBankAccountDao(){
        if (dao==null)
            dao=new BankAccountDaoImpl();
        return dao;
    }

}
