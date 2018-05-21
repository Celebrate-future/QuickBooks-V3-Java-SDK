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
 * <p>Java class for ItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Assembly"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="Fixed Asset"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="NonInventory"/>
 *     &lt;enumeration value="Other Charge"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Subtotal"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Tax Group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemTypeEnum")
@XmlEnum
public enum ItemTypeEnum {

    @XmlEnumValue("Assembly")
    ASSEMBLY("Assembly"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Fixed Asset")
    FIXED_ASSET("Fixed Asset"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("NonInventory")
    NON_INVENTORY("NonInventory"),
    @XmlEnumValue("Other Charge")
    OTHER_CHARGE("Other Charge"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Subtotal")
    SUBTOTAL("Subtotal"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Tax Group")
    TAX_GROUP("Tax Group");
    private final String value;

    ItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemTypeEnum fromValue(String v) {
        for (ItemTypeEnum c: ItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
