package ru.bcomms.organization.entity;

import common.DocumentRegistration;

public class Documents {
    // Свидетельство о регистрации в налоговой
    public DocumentRegistration ftsRegistration;
    // Сведения об учете в налоговом органе, структура
    // аналогична fts_registration
    public DocumentRegistration ftsReport;
    // Свидетельство о регистрации в Пенсионном фонде,
    // структура аналогична fts_registration
    public DocumentRegistration pfRegistration;
    // Свидетельство о регистрации в Фонде соц. страхования,
    // структура аналогична fts_registration
    public DocumentRegistration sifRegistration;
    // Запись в реестре малого и среднего предпринимательства
    public DocumentSmb smb;
}
