package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void testDaoFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        String name = itemsDao.findById(1).getName();
        System.out.println(name);
    }

    @Test
    public void testServiceFindById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        System.out.println(itemsService.findById(1).getName());
    }
}
