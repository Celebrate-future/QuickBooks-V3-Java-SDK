//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 11:23:24 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Contact information identified by Type.
 * 			
 * 
 * <p>Java class for ContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://schema.intuit.com/finance/v3}ContactTypeEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Telephone" type="{http://schema.intuit.com/finance/v3}TelephoneNumber" minOccurs="0"/>
 *           &lt;element name="Email" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/>
 *           &lt;element name="WebSite" type="{http://schema.intuit.com/finance/v3}WebSiteAddress" minOccurs="0"/>
 *           &lt;element name="OtherContact" type="{http://schema.intuit.com/finance/v3}GenericContactType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "type",
    "telephone",
    "email",
    "webSite",
    "otherContact"
})
public class ContactInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Type")
    protected ContactTypeEnum type;
    @XmlElement(name = "Telephone")
    protected TelephoneNumber telephone;
    @XmlElement(name = "Email")
    protected EmailAddress email;
    @XmlElement(name = "WebSite")
    protected WebSiteAddress webSite;
    @XmlElement(name = "OtherContact")
    protected GenericContactType otherContact;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeEnum }
     *     
     */
    public ContactTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeEnum }
     *     
     */
    public void setType(ContactTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setTelephone(TelephoneNumber value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmail(EmailAddress value) {
        this.email = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link WebSiteAddress }
     *     
     */
    public WebSiteAddress getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebSiteAddress }
     *     
     */
    public void setWebSite(WebSiteAddress value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the otherContact property.
     * 
     * @return
     *     possible object is
     *     {@link GenericContactType }
     *     
     */
    public GenericContactType getOtherContact() {
        return otherContact;
    }

    /**
     * Sets the value of the otherContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericContactType }
     *     
     */
    public void setOtherContact(GenericContactType value) {
        this.otherContact = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContactInfo that = ((ContactInfo) object);
        {
            ContactTypeEnum lhsType;
            lhsType = this.getType();
            ContactTypeEnum rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            TelephoneNumber lhsTelephone;
            lhsTelephone = this.getTelephone();
            TelephoneNumber rhsTelephone;
            rhsTelephone = that.getTelephone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telephone", lhsTelephone), LocatorUtils.property(thatLocator, "telephone", rhsTelephone), lhsTelephone, rhsTelephone, (this.telephone!= null), (that.telephone!= null))) {
                return false;
            }
        }
        {
            EmailAddress lhsEmail;
            lhsEmail = this.getEmail();
            EmailAddress rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail, (this.email!= null), (that.email!= null))) {
                return false;
            }
        }
        {
            WebSiteAddress lhsWebSite;
            lhsWebSite = this.getWebSite();
            WebSiteAddress rhsWebSite;
            rhsWebSite = that.getWebSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSite", lhsWebSite), LocatorUtils.property(thatLocator, "webSite", rhsWebSite), lhsWebSite, rhsWebSite, (this.webSite!= null), (that.webSite!= null))) {
                return false;
            }
        }
        {
            GenericContactType lhsOtherContact;
            lhsOtherContact = this.getOtherContact();
            GenericContactType rhsOtherContact;
            rhsOtherContact = that.getOtherContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherContact", lhsOtherContact), LocatorUtils.property(thatLocator, "otherContact", rhsOtherContact), lhsOtherContact, rhsOtherContact, (this.otherContact!= null), (that.otherContact!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ContactTypeEnum theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            TelephoneNumber theTelephone;
            theTelephone = this.getTelephone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telephone", theTelephone), currentHashCode, theTelephone, (this.telephone!= null));
        }
        {
            EmailAddress theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail, (this.email!= null));
        }
        {
            WebSiteAddress theWebSite;
            theWebSite = this.getWebSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSite", theWebSite), currentHashCode, theWebSite, (this.webSite!= null));
        }
        {
            GenericContactType theOtherContact;
            theOtherContact = this.getOtherContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherContact", theOtherContact), currentHashCode, theOtherContact, (this.otherContact!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
