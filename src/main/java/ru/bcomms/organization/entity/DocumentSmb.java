package ru.bcomms.organization.entity;

import common.SMBCategory;

import java.util.Date;

public class DocumentSmb {
    // тип документа (= SMB)
    protected String smbType;
    // категория предприятия (MICRO, SMALL или MEDIUM)
    protected SMBCategory category;
    // дата регистрации в реестре
    protected Date issueDate;
}
