package ru.bcomms.organization.entity;

public class Manager{
    // ОГРН руководителя (для юрлиц)
    protected String ogrn;
    // ИНН руководителя
    public String inn;
    // наименование руководителя (для юрлиц)
    protected String managerName;
    // ФИО руководителя (для физлиц)
    public Fio fio;
    // должность руководителя (для физлиц)
    public String post;
    // внутренний идентификатор
    public String hid;
    // тип руководителя
    public ManagerType managerType;
    // Недостоверность сведений о руководителе
    public ManagerInvalidity invalidity;
}
