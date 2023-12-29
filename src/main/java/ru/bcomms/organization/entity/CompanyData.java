package ru.bcomms.organization.entity;

import address.Address;
import common.BranchType;
import common.OrganizationType;

import java.util.Date;
import java.util.List;

public class CompanyData {
    // ИНН
    public String inn;
    // КПП
    public String kpp;
    // ОГРН
    public String ogrn;
    // Дата выдачи ОГРН
    public Date ogrnDate;
    // Тип организации
    public OrganizationType organizationType;
    // Наименование
    public CompanyName companyName;
    // ФИО индивидуального предпринимателя
    protected Fio fio;

    // Коды статистики (только для действующих головных организаций и ИП):
    public String okato;
    public String oktmo;
    public String okpo;
    public String okogu;
    public String okfs;
    public String okved;
    // Версия справочника ОКВЭД (2001 или 2014)
    public String okvedType;
    // Коды ОКВЭД дополнительных видов деятельности
    public List<Okved> okveds;

    // Организационно-правовая форма
    public Opf opf;
    // Руководитель
    public Management management;
    // Количество филиалов
    public Integer branchCount;
    // Тип подразделения
    public BranchType branchType;
    // Адрес
    public Address address;
    // статус организации
    public State state;

    // Среднесписочная численность работников
    public Integer employeeCount;
    // Система налогообложения
    public Finance finance;
    // Сведения о налоговой, ПФР и ФСС
    public Authorities authorities;
    // Гражданство ИП
    protected Citizenship citizenship;

    // Учредители компании
    public List<Founder> founders;
    // Руководители компании
    public List<Manager> managers;

    // Правопредшественники, только для юрлиц
    public List<Predecessor> predecessors;
    // Правопреемники, только для юрлиц
    public List<Successors> successors;

    // Уставной капитал компании
    public Capital capital;

    // Документы
    public Documents documents;
    // Лицензии
    public List<License> licenses;

    // Телефоны
    public List<Phone> phones;
    // Адреса эл. почты
    public List<Email> emails;

    // Признак недостоверных сведений об организации (true/null)
    public Boolean invalid;

}
