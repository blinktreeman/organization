package ru.bcomms.organization.entity;

public class CompanyName {
    // полное наименование
    public String fullWithOpf;
    // краткое наименование
    public String shortWithOpf;
    // не заполняется
    public String latin;
    // полное наименование без ОПФ генерируется на основе
    // full_with_opf, может содержать ошибки
    public String fullWithoutOpf;
    // краткое наименование без ОПФ генерируется на основе
    // short_with_opf, может содержать ошибки
    public String shortWithoutOpf;
}
