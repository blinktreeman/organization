package ru.bcomms.organization.entity;

public class PhoneData {
    // телефон одной строкой как в ЕГРЮЛ
    public String source;
    // тип телефона (мобильный, стационарный, ...)
    public String type;
    // код страны
    public String countryCode;
    // код города / DEF-код
    public String cityCode;
    // локальный номер телефона
    public String number;
    // оператор связи
    public String provider;
    // регион
    public String region;
    // город (только для стационарных телефонов)
    public String city;
    // часовой пояс
    public String timezone;
    // контактное лицо
    public String contact;
}
