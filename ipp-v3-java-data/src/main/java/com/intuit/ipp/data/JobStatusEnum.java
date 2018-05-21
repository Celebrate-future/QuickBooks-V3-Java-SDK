//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 11:23:24 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Awarded"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NotAwarded"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobStatusEnum")
@XmlEnum
public enum JobStatusEnum {

    @XmlEnumValue("Awarded")
    AWARDED("Awarded"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NotAwarded")
    NOT_AWARDED("NotAwarded"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    JobStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobStatusEnum fromValue(String v) {
        for (JobStatusEnum c: JobStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
