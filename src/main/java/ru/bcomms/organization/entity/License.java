package ru.bcomms.organization.entity;

import java.util.Date;
import java.util.List;

public class License {
    // серия документа
    public String series;
    // номер документа
    public String number;
    // дата выдачи
    public Date issueDate;
    // название выдавшего органа
    public String issueAuthority;
    // дата приостановки
    public Date suspendDate;
    // название приостановившего органа
    public String suspendAuthority;
    // дата начала действия
    public Date validFrom;
    // дата окончания действия
    public Date validTo;
    // перечень лицензируемых видов деятельности
    public List<String> activities;
    // перечень адресов, по которым действует лицензия
    public List<String> addresses;
}
