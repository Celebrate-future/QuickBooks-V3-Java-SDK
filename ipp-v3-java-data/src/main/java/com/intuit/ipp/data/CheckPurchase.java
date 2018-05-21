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
 * Financial Transaction information that pertains to
 * 				the entire Check.
 * 
 * <p>Java class for CheckPurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPurchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="PayeeAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="MemoOnCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintStatus" type="{http://schema.intuit.com/finance/v3}PrintStatusEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPurchase", propOrder = {
    "accountRef",
    "payeeAddr",
    "memoOnCheck",
    "printStatus"
})
public class CheckPurchase implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "PayeeAddr")
    protected PhysicalAddress payeeAddr;
    @XmlElement(name = "MemoOnCheck")
    protected String memoOnCheck;
    @XmlElement(name = "PrintStatus")
    protected PrintStatusEnum printStatus;

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the payeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPayeeAddr() {
        return payeeAddr;
    }

    /**
     * Sets the value of the payeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPayeeAddr(PhysicalAddress value) {
        this.payeeAddr = value;
    }

    /**
     * Gets the value of the memoOnCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoOnCheck() {
        return memoOnCheck;
    }

    /**
     * Sets the value of the memoOnCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoOnCheck(String value) {
        this.memoOnCheck = value;
    }

    /**
     * Gets the value of the printStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PrintStatusEnum }
     *     
     */
    public PrintStatusEnum getPrintStatus() {
        return printStatus;
    }

    /**
     * Sets the value of the printStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintStatusEnum }
     *     
     */
    public void setPrintStatus(PrintStatusEnum value) {
        this.printStatus = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CheckPurchase that = ((CheckPurchase) object);
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef, (this.accountRef!= null), (that.accountRef!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPayeeAddr;
            lhsPayeeAddr = this.getPayeeAddr();
            PhysicalAddress rhsPayeeAddr;
            rhsPayeeAddr = that.getPayeeAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payeeAddr", lhsPayeeAddr), LocatorUtils.property(thatLocator, "payeeAddr", rhsPayeeAddr), lhsPayeeAddr, rhsPayeeAddr, (this.payeeAddr!= null), (that.payeeAddr!= null))) {
                return false;
            }
        }
        {
            String lhsMemoOnCheck;
            lhsMemoOnCheck = this.getMemoOnCheck();
            String rhsMemoOnCheck;
            rhsMemoOnCheck = that.getMemoOnCheck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "memoOnCheck", lhsMemoOnCheck), LocatorUtils.property(thatLocator, "memoOnCheck", rhsMemoOnCheck), lhsMemoOnCheck, rhsMemoOnCheck, (this.memoOnCheck!= null), (that.memoOnCheck!= null))) {
                return false;
            }
        }
        {
            PrintStatusEnum lhsPrintStatus;
            lhsPrintStatus = this.getPrintStatus();
            PrintStatusEnum rhsPrintStatus;
            rhsPrintStatus = that.getPrintStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "printStatus", lhsPrintStatus), LocatorUtils.property(thatLocator, "printStatus", rhsPrintStatus), lhsPrintStatus, rhsPrintStatus, (this.printStatus!= null), (that.printStatus!= null))) {
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
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef, (this.accountRef!= null));
        }
        {
            PhysicalAddress thePayeeAddr;
            thePayeeAddr = this.getPayeeAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payeeAddr", thePayeeAddr), currentHashCode, thePayeeAddr, (this.payeeAddr!= null));
        }
        {
            String theMemoOnCheck;
            theMemoOnCheck = this.getMemoOnCheck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memoOnCheck", theMemoOnCheck), currentHashCode, theMemoOnCheck, (this.memoOnCheck!= null));
        }
        {
            PrintStatusEnum thePrintStatus;
            thePrintStatus = this.getPrintStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "printStatus", thePrintStatus), currentHashCode, thePrintStatus, (this.printStatus!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
