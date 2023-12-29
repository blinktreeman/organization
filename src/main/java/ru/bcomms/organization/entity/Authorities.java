package ru.bcomms.organization.entity;

import common.AuthoritiesRegistration;

public class Authorities {
    // ИФНС регистрации
    public AuthoritiesRegistration ftsRegistration;
    // ИФНС отчётности, структура аналогична
    // fts_registration
    public AuthoritiesRegistration ftsReport;
    // Отделение Пенсионного фонда,
    // структура аналогична fts_registration
    public AuthoritiesRegistration pf;
    // Отделение Фонда соц. страхования,
    // структура аналогична fts_registration
    public AuthoritiesRegistration sif;
}
