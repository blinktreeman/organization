package ru.bcomms.organization.entity;

import common.FounderShareType;

public class FounderShare {
    // тип значения (PERCENT / DECIMAL / FRACTION)
    protected FounderShareType founderShareType;
    // значение (для type = PERCENT и type = DECIMAL)
    protected Double shareValue;
    // числитель дроби (для type = FRACTION)
    protected String numerator;
    // знаменатель дроби (для type = FRACTION)
    protected String denominator;
}
