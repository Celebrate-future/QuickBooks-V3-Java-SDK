//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 11:23:24 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for CDCResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDCResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="QueryResponse" type="{http://schema.intuit.com/finance/v3}QueryResponse" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDCResponse", propOrder = {
    "queryResponse",
    "fault"
})
public class CDCResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QueryResponse")
    protected List<QueryResponse> queryResponse;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlAttribute(name = "size")
    protected Integer size;

    /**
     * Gets the value of the queryResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResponse }
     * 
     * 
     */
    public List<QueryResponse> getQueryResponse() {
        if (queryResponse == null) {
            queryResponse = new ArrayList<QueryResponse>();
        }
        return this.queryResponse;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Sets the value of the queryResponse property.
     * 
     * @param queryResponse
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryResponse(List<QueryResponse> queryResponse) {
        this.queryResponse = queryResponse;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CDCResponse that = ((CDCResponse) object);
        {
            List<QueryResponse> lhsQueryResponse;
            lhsQueryResponse = (((this.queryResponse!= null)&&(!this.queryResponse.isEmpty()))?this.getQueryResponse():null);
            List<QueryResponse> rhsQueryResponse;
            rhsQueryResponse = (((that.queryResponse!= null)&&(!that.queryResponse.isEmpty()))?that.getQueryResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryResponse", lhsQueryResponse), LocatorUtils.property(thatLocator, "queryResponse", rhsQueryResponse), lhsQueryResponse, rhsQueryResponse, ((this.queryResponse!= null)&&(!this.queryResponse.isEmpty())), ((that.queryResponse!= null)&&(!that.queryResponse.isEmpty())))) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, (this.fault!= null), (that.fault!= null))) {
                return false;
            }
        }
        {
            Integer lhsSize;
            lhsSize = this.getSize();
            Integer rhsSize;
            rhsSize = that.getSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
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
            List<QueryResponse> theQueryResponse;
            theQueryResponse = (((this.queryResponse!= null)&&(!this.queryResponse.isEmpty()))?this.getQueryResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryResponse", theQueryResponse), currentHashCode, theQueryResponse, ((this.queryResponse!= null)&&(!this.queryResponse.isEmpty())));
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, (this.fault!= null));
        }
        {
            Integer theSize;
            theSize = this.getSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize, (this.size!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
