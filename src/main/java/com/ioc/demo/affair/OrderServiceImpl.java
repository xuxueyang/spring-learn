package com.ioc.demo.affair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@Service
public class OrderServiceImpl {
    @Autowired
    PlatformTransactionManager platformTransactionManager;
    @Autowired
    TransactionDefinition transactionDefinition;
    public  void addOrder(){
        TransactionStatus status = platformTransactionManager.getTransaction(transactionDefinition);
        try {
            platformTransactionManager.commit(status);
        }catch (Exception e){
            platformTransactionManager.rollback(status);
        }


    }
}
