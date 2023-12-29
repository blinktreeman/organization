package ru.bcomms.organization.entity.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;


@Data
@Entity
@Table(name = "address_data")
public class AddressData {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne(mappedBy = "address_data")
    private Address address;

    // Исходный адрес одной строкой
    @JsonProperty("source")
    private String source;
    // Стандартизованный адрес одной строкой
    @JsonProperty("result")
    private String result;

    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    @JsonProperty("federal_district")
    private String federalDistrict;
    @JsonProperty("region_fias_id")
    private String regionFiasId;
    @JsonProperty("region_kladr_id")
    private String regionKladrId;
    @JsonProperty("region_iso_code")
    private String regionIsoCode;
    @JsonProperty("region_with_type")
    private String regionWithType;
    @JsonProperty("region_type")
    private String regionType;
    @JsonProperty("region_type_full")
    private String regionTypeFull;
    @JsonProperty("region")
    private String region;
    @JsonProperty("area_fias_id")
    private String areaFiasId;
    @JsonProperty("area_kladr_id")
    private String areaKladrId;
    @JsonProperty("area_with_type")
    private String areaWithType;
    @JsonProperty("area_type")
    private Object areaType;
    @JsonProperty("area_type_full")
    private Object areaTypeFull;
    @JsonProperty("area")
    private Object area;
    @JsonProperty("city_fias_id")
    private Object cityFiasId;
    @JsonProperty("city_kladr_id")
    private Object cityKladrId;
    @JsonProperty("city_with_type")
    private Object cityWithType;
    @JsonProperty("city_type")
    private Object cityType;
    @JsonProperty("city_type_full")
    private Object cityTypeFull;
    @JsonProperty("city")
    private Object city;
    @JsonProperty("city_area")
    private String cityArea;
    @JsonProperty("city_district_fias_id")
    private Object cityDistrictFiasId;
    @JsonProperty("city_district_kladr_id")
    private Object cityDistrictKladrId;
    @JsonProperty("city_district_with_type")
    private String cityDistrictWithtype;
    @JsonProperty("city_district_type")
    private String cityDistrictType;
    @JsonProperty("city_district_type_full")
    private String cityDistrictTypeFull;
    @JsonProperty("city_district")
    private String cityDistrict;
    @JsonProperty("settlement_fias_id")
    private String settlementFiasId;
    @JsonProperty("settlement_kladr_id")
    private String settlementKladrId;
    @JsonProperty("settlement_with_type")
    private String settlementWithType;
    @JsonProperty("settlement_type")
    private String settlementType;
    @JsonProperty("settlement_type_full")
    private String settlementTypeFull;
    @JsonProperty("settlement")
    private String settlement;
    @JsonProperty("street_fias_id")
    private String streetFiasId;
    @JsonProperty("street_kladr_id")
    private String streetKladrId;
    @JsonProperty("street_with_type")
    private String streetWithType;
    @JsonProperty("street_type")
    private String streetType;
    @JsonProperty("street_type_full")
    private String streetTypeFull;
    @JsonProperty("street")
    private String street;
    @JsonProperty("stead_fias_id")
    private String steadFiasId;
    @JsonProperty("stead_kladr_id")
    private String steadKladrId;
    @JsonProperty("stead_cadnum")
    private String steadCadnum;
    @JsonProperty("stead_type")
    private String steadType;
    @JsonProperty("stead_type_full")
    private String steadTypeFull;
    @JsonProperty("stead")
    private String stead;
    @JsonProperty("house_fias_id")
    private String houseFiasId;
    @JsonProperty("house_kladr_id")
    private String houseKladrId;
    @JsonProperty("house_cadnum")
    private String houseCadnum;
    @JsonProperty("house_type")
    private String houseType;
    @JsonProperty("house_type_full")
    private String houseTypeFull;
    @JsonProperty("house")
    private String house;
    @JsonProperty("block_type")
    private String blockType;
    @JsonProperty("block_type_full")
    private String blockTypeFull;
    @JsonProperty("block")
    private String block;
    @JsonProperty("entrance")
    private String entrance;
    @JsonProperty("floor")
    private String floor;
    @JsonProperty("flat_fias_id")
    private String flatFiasId;
    @JsonProperty("flat_cadnum")
    private String flatCadnum;
    @JsonProperty("flat_type")
    private String flatType;
    @JsonProperty("flat_type_full")
    private String flatTypeFull;
    @JsonProperty("flat")
    private String flat;
    @JsonProperty("flat_area")
    private String flatArea;
    @JsonProperty("square_meter_price")
    private String squareMeterPrice;
    @JsonProperty("flat_price")
    private String flatPrice;
    @JsonProperty("postal_box")
    private String postalBox;
    @JsonProperty("fias_id")
    private String fiasId;
    // Не заполняется, используйте fias_id
    @JsonProperty("fias_code")
    private String fiasCode;
    /*
    Уровень детализации, до которого адрес найден в ФИАС
    0 — страна
    1 — регион
    3 — район
    4 — город
    5 — район города
    6 — населенный пункт
    7 — улица
    8 — дом
    9 — квартира
    65 — планировочная структура
    90 — доп. территория
    91 — улица в доп. территории
    -1 — иностранный или пустой
     */
    @JsonProperty("fias_level")
    private Integer fiasLevel;
    /*
    Признак актуальности адреса в ФИАС
    0 — актуальный
    1-50 — переименован
    51 — переподчинен
    99 — удален
    */
    @JsonProperty("fias_actuality_state")
    private String fiasActualityState;
    @JsonProperty("kladr_id")
    private String kladrId;
    /*
    Признак центра района или региона
    1 — центр района
      (Московская обл, Одинцовский р-н, г Одинцово)
    2 — центр региона
      (Новосибирская обл, г Новосибирск)
    3 — центр района и региона
      (Томская обл, г Томск)
    4 — центральный район региона
      (Тюменская обл, Тюменский р-н)
    0 — ничего из перечисленного
      (Московская обл, г Балашиха)
     */
    @JsonProperty("capital_marker")
    private String capitalMarker;
    @JsonProperty("okato")
    private String okato;
    @JsonProperty("oktmo")
    private String oktmo;
    @JsonProperty("tax_office")
    private String taxOffice;
    @JsonProperty("tax_office_legal")
    private String taxOfficeLegal;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("geo_lat")
    private String geoLat;
    @JsonProperty("geo_lon")
    private String geoLon;
    @JsonProperty("beltway_hit")
    private String beltwayHit;
    @JsonProperty("beltway_distance")
    private String beltwayDistance;
    @JsonProperty("qc_geo")
    private Integer qcGeo;
    @JsonProperty("qc_complete")
    private Integer qcComplete;
    @JsonProperty("qc_house")
    private Integer qcHouse;
    @JsonProperty("qc")
    private Integer qc;
    @JsonProperty("unparsed_parts")
    private String unparsedParts;

    @OneToMany(mappedBy = "address_data")
    private Set<Metro> metro;
}
