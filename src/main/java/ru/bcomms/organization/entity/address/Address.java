package ru.bcomms.organization.entity.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private UUID uuid;

    // Адрес одной строкой:
    // адрес организации для юридических лиц;
    // город проживания для индивидуальных предпринимателей.
    // Стандартизован, поэтому может отличаться от записанного в ЕГРЮЛ
    @JsonProperty("value")
    private String addressValue;
    // адрес одной строкой (полный, с индексом)
    // стандартизован, поэтому может отличаться от записанного в ЕГРЮЛ
    @JsonProperty("unrestricted_value")
    private String unrestrictedValue;

    // Недостоверность сведений об адресе
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_invalidity_uuid", referencedColumnName = "uuid")
    @JsonProperty("invalidity")
    private AddressInvalidity addressInvalidity;

    // гранулярный адрес
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_data_uuid", referencedColumnName = "uuid")
    @JsonProperty("address_data")
    private AddressData addressData;
}
