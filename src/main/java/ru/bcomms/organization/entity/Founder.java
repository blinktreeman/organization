package ru.bcomms.organization.entity;

import common.FounderType;

public class Founder {
    // ОГРН учредителя (для юрлиц)
    protected String founderOgrn;
    // ИНН учредителя
    protected String founderInn;
    // наименование учредителя (для юрлиц)
    protected String founderName;
    // ФИО учредителя (для физлиц)
    protected String fio;
    // внутренний идентификатор
    protected String hid;
    // тип учредителя (LEGAL / PHYSICAL)
    protected FounderType founderType;
    // Доля учредителя
    protected FounderShare founderShare;
}
