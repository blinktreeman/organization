package ru.bcomms.organization.entity.address;

import jakarta.persistence.*;
import lombok.Data;
import ru.bcomms.organization.entity.common.DataInvalidityCode;
import ru.bcomms.organization.entity.common.DataInvalidityCourtDecision;

import java.util.UUID;

@Data
@Entity
@Table(name = "address_invalidity")
public class AddressInvalidity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne(mappedBy = "address_invalidity")
    private Address address;

    // код причины недостоверности
    private DataInvalidityCode code;

    @OneToOne
    @JoinColumn(name = "data_invalidity_court_decision_uuid",
            referencedColumnName = "uuid")
    // решение суда (только для code = COURT)
    private DataInvalidityCourtDecision decision;
}
