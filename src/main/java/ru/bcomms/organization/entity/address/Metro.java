package ru.bcomms.organization.entity.address;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "metro")
public class Metro {
    @Id
    @GeneratedValue
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "address_data_uuid", nullable = false)
    private AddressData addressData;

    private String name;
    private String line;
    private Double distance;
}
