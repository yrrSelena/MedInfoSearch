package com.yrr.service;

import com.yrr.bean.Formula;
import com.yrr.bean.FormulaExample;
import com.yrr.dao.FormulaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormulaService {
    @Autowired
    FormulaMapper formulaMapper;

    //通过药品序号获得所有的中文别名
    //通过药品序号medId获得所有的中文别名
    public List<String> selectFormulaByMedId(Integer medId){
        FormulaExample formulaExample = new FormulaExample();
        formulaExample.createCriteria().andMedIdEqualTo(medId);
        List<Formula> formulaList = formulaMapper.selectByExample(formulaExample);
        List<String> formulas = new ArrayList<>();
        Integer len = formulaList.size();
        if(len>0) {
            for (int i = 0; i < len; i++) {
                formulas.add(formulaList.get(i).getFormula());
            }
        }
        return formulas;
    }


}
