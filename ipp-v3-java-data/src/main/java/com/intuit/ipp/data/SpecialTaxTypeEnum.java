//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 11:23:24 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialTaxTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialTaxTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ZERO_RATE"/>
 *     &lt;enumeration value="FOREIGN_TAX"/>
 *     &lt;enumeration value="REVERSE_CHARGE"/>
 *     &lt;enumeration value="ADJUSTMENT_RATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialTaxTypeEnum")
@XmlEnum
public enum SpecialTaxTypeEnum {

    NONE,
    ZERO_RATE,
    FOREIGN_TAX,
    REVERSE_CHARGE,
    ADJUSTMENT_RATE;

    public String value() {
        return name();
    }

    public static SpecialTaxTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
