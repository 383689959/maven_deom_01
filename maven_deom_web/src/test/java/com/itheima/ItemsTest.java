package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void test () {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);

    }
}
