package ru.bcomms.organization.entity.common;

import java.util.Date;

public class DocumentRegistration {
    // тип документа (= FTS_REGISTRATION)
    protected String documentType;
    // серия документа
    public String documentSeries;
    // номер документа
    public String documentNumber;
    // дата выдачи
    public Date issueDate;
    // код подразделения
    public String issueAuthority;
}
