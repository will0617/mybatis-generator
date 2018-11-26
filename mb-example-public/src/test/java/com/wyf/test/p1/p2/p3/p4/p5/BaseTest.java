package com.wyf.test.p1.p2.p3.p4.p5;

import com.wyf.examples.Application;
import com.wyf.examples.dao.MybatisGenTestMapper;
import com.wyf.examples.model.MybatisGenTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: ${description}
 * @author: WangYuFei
 * @create: 2018-11-26 13:49
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @Autowired
    private MybatisGenTestMapper mapper;

    @Test
    public void testInsert() {
        MybatisGenTest entity = new MybatisGenTest();
        entity.setTestTinyint1(true);
        entity.setTestTinyint2((byte) 77);
        mapper.insertSelective(entity);
        LOGGER.debug("not ptiny");
        LOGGER.info("print info");
        LOGGER.warn("print warn");
        LOGGER.error("print error");
    }


}
