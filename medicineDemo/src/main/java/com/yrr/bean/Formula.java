package com.yrr.bean;

import java.io.Serializable;

public class Formula implements Serializable {
    private Integer formulaId;

    private String formula;

    private Integer medId;

    private static final long serialVersionUID = 1L;

    public Integer getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(Integer formulaId) {
        this.formulaId = formulaId;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }
}