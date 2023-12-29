package ru.bcomms.organization.entity;

import common.TaxSystemType;

import java.util.Date;

public class Finance {
    // Система налогообложения
    public TaxSystemType taxSystem;
    // год бух. отчетности
    public Date year;
    // доходы по бух. отчетности
    public Long income;
    // выручка по бух. отчетности
    public Long revenue;
    // расходы по бух. отчетности
    public Long expense;
    // недоимки по налогам
    public Long debt;
    // налоговые штрафы
    public Long penalty;
}
