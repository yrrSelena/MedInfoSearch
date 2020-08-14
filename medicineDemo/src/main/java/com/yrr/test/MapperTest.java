package com.yrr.test;
import com.yrr.bean.ENAlias;
import com.yrr.bean.History;
import com.yrr.bean.HistoryExample;
import com.yrr.dao.ENAliasMapper;
import com.yrr.dao.HistoryMapper;
import com.yrr.dao.MedMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    MedMapper medMapper;

    @Autowired
    ENAliasMapper enAliasMapper;

//    @Test
//    public void testCRUD(){
//        //System.out.println(medMapper);
//        ENAlias enAlias = enAliasMapper.selectByPrimaryKey(1);
//        System.out.println(enAlias);//.getEnAlias());
//
//    }
    @Autowired
    HistoryMapper historyMapper;

    @Test
    public void testHistory(){
        HistoryExample historyExample= new HistoryExample();
        historyExample.setOrderByClause("create_time asc");
        List<History> history = historyMapper.selectByExample(historyExample);
        for(int i= 0; i<history.size();i++)
        {
            System.out.println(history.get(i).getCreate_time());
        }
        History his = new History();
        his.setContent("hhhhhh");
        Date create_time = new Date();
        his.setCreate_time(create_time);
        his.setHisId(history.get(0).getHisId());
        historyMapper.updateByPrimaryKey(his);
    }



}
