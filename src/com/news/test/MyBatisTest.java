/*package com.news.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.news.dao.NewsMapper;
import com.news.entity.News;
import com.news.entity.Page;
 
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration("classpath:applicationContext.xml")
public class MyBatisTest {
 
    @Autowired
    private NewsMapper newsMapper;
 
//  @Test
    public void testAdd() {
        for (int i = 0; i < 100; i++) {
            News news = new News();
            news.setTitle("new Category");
            newsMapper.add(news);
        }
 
    }
     
    @Test
    public void testTotal() {
        int total = newsMapper.total();
        System.out.println(total);
    }
 
    @Test
    public void testList() {
        Page p = new Page();
        p.setStart(2);
        p.setCount(3);
        List<News> cs=newsMapper.list(p);
        for (News c : cs) {
            System.out.println(c.getTitle());
        }
    }
 
}*/
