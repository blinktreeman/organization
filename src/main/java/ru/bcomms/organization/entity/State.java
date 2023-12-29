package ru.bcomms.organization.entity;

import common.OrganizationStatus;

import java.util.Date;

public class State {
    private OrganizationStatus status;
    // детальный статус
    public String code;
    // дата последних изменений
    public Date actualityDate;
    // дата регистрации
    public Date registrationDate;
    // дата ликвидации
    public Date liquidationDate;
}
