package ru.bcomms.organization.entity.common;

import jakarta.persistence.*;
import lombok.Data;
import ru.bcomms.organization.entity.address.AddressInvalidity;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "data_invalidity_court_decision")
public class DataInvalidityCourtDecision {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne(mappedBy = "data_invalidity_court_decision")
    private AddressInvalidity addressInvalidity;

    // наименование суда
    private String courtName;
    // номер судебного решения
    private String number;
    // дата судебного решения
    private Date date;
}
