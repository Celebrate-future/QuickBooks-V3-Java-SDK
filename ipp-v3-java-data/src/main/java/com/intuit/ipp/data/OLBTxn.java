//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 11:23:24 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes OLBTransactions list that are downloaded
 * 			
 * 
 * <p>Java class for OLBTxn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OLBTxn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="LastPostingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TxnsDownloadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OLBTxnDetail" type="{http://schema.intuit.com/finance/v3}OLBTxnDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="startPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OLBTxn", propOrder = {
    "accountId",
    "lastPostingDate",
    "txnsDownloadTime",
    "olbTxnDetail"
})
public class OLBTxn implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccountId")
    protected ReferenceType accountId;
    @XmlElement(name = "LastPostingDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date lastPostingDate;
    @XmlElement(name = "TxnsDownloadTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date txnsDownloadTime;
    @XmlElement(name = "OLBTxnDetail")
    protected List<OLBTxnDetail> olbTxnDetail;
    @XmlAttribute(name = "startPosition")
    protected Integer startPosition;
    @XmlAttribute(name = "maxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "totalCount")
    protected Integer totalCount;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountId(ReferenceType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the lastPostingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastPostingDate() {
        return lastPostingDate;
    }

    /**
     * Sets the value of the lastPostingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPostingDate(Date value) {
        this.lastPostingDate = value;
    }

    /**
     * Gets the value of the txnsDownloadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxnsDownloadTime() {
        return txnsDownloadTime;
    }

    /**
     * Sets the value of the txnsDownloadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnsDownloadTime(Date value) {
        this.txnsDownloadTime = value;
    }

    /**
     * Gets the value of the olbTxnDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the olbTxnDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLBTxnDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLBTxnDetail }
     * 
     * 
     */
    public List<OLBTxnDetail> getOLBTxnDetail() {
        if (olbTxnDetail == null) {
            olbTxnDetail = new ArrayList<OLBTxnDetail>();
        }
        return this.olbTxnDetail;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPosition(Integer value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Sets the value of the olbTxnDetail property.
     * 
     * @param olbTxnDetail
     *     allowed object is
     *     {@link OLBTxnDetail }
     *     
     */
    public void setOLBTxnDetail(List<OLBTxnDetail> olbTxnDetail) {
        this.olbTxnDetail = olbTxnDetail;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OLBTxn that = ((OLBTxn) object);
        {
            ReferenceType lhsAccountId;
            lhsAccountId = this.getAccountId();
            ReferenceType rhsAccountId;
            rhsAccountId = that.getAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountId", lhsAccountId), LocatorUtils.property(thatLocator, "accountId", rhsAccountId), lhsAccountId, rhsAccountId, (this.accountId!= null), (that.accountId!= null))) {
                return false;
            }
        }
        {
            Date lhsLastPostingDate;
            lhsLastPostingDate = this.getLastPostingDate();
            Date rhsLastPostingDate;
            rhsLastPostingDate = that.getLastPostingDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastPostingDate", lhsLastPostingDate), LocatorUtils.property(thatLocator, "lastPostingDate", rhsLastPostingDate), lhsLastPostingDate, rhsLastPostingDate, (this.lastPostingDate!= null), (that.lastPostingDate!= null))) {
                return false;
            }
        }
        {
            Date lhsTxnsDownloadTime;
            lhsTxnsDownloadTime = this.getTxnsDownloadTime();
            Date rhsTxnsDownloadTime;
            rhsTxnsDownloadTime = that.getTxnsDownloadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnsDownloadTime", lhsTxnsDownloadTime), LocatorUtils.property(thatLocator, "txnsDownloadTime", rhsTxnsDownloadTime), lhsTxnsDownloadTime, rhsTxnsDownloadTime, (this.txnsDownloadTime!= null), (that.txnsDownloadTime!= null))) {
                return false;
            }
        }
        {
            List<OLBTxnDetail> lhsOLBTxnDetail;
            lhsOLBTxnDetail = (((this.olbTxnDetail!= null)&&(!this.olbTxnDetail.isEmpty()))?this.getOLBTxnDetail():null);
            List<OLBTxnDetail> rhsOLBTxnDetail;
            rhsOLBTxnDetail = (((that.olbTxnDetail!= null)&&(!that.olbTxnDetail.isEmpty()))?that.getOLBTxnDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbTxnDetail", lhsOLBTxnDetail), LocatorUtils.property(thatLocator, "olbTxnDetail", rhsOLBTxnDetail), lhsOLBTxnDetail, rhsOLBTxnDetail, ((this.olbTxnDetail!= null)&&(!this.olbTxnDetail.isEmpty())), ((that.olbTxnDetail!= null)&&(!that.olbTxnDetail.isEmpty())))) {
                return false;
            }
        }
        {
            Integer lhsStartPosition;
            lhsStartPosition = this.getStartPosition();
            Integer rhsStartPosition;
            rhsStartPosition = that.getStartPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startPosition", lhsStartPosition), LocatorUtils.property(thatLocator, "startPosition", rhsStartPosition), lhsStartPosition, rhsStartPosition, (this.startPosition!= null), (that.startPosition!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxResults;
            lhsMaxResults = this.getMaxResults();
            Integer rhsMaxResults;
            rhsMaxResults = that.getMaxResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxResults", lhsMaxResults), LocatorUtils.property(thatLocator, "maxResults", rhsMaxResults), lhsMaxResults, rhsMaxResults, (this.maxResults!= null), (that.maxResults!= null))) {
                return false;
            }
        }
        {
            Integer lhsTotalCount;
            lhsTotalCount = this.getTotalCount();
            Integer rhsTotalCount;
            rhsTotalCount = that.getTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCount", lhsTotalCount), LocatorUtils.property(thatLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount, (this.totalCount!= null), (that.totalCount!= null))) {
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
            ReferenceType theAccountId;
            theAccountId = this.getAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountId", theAccountId), currentHashCode, theAccountId, (this.accountId!= null));
        }
        {
            Date theLastPostingDate;
            theLastPostingDate = this.getLastPostingDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastPostingDate", theLastPostingDate), currentHashCode, theLastPostingDate, (this.lastPostingDate!= null));
        }
        {
            Date theTxnsDownloadTime;
            theTxnsDownloadTime = this.getTxnsDownloadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnsDownloadTime", theTxnsDownloadTime), currentHashCode, theTxnsDownloadTime, (this.txnsDownloadTime!= null));
        }
        {
            List<OLBTxnDetail> theOLBTxnDetail;
            theOLBTxnDetail = (((this.olbTxnDetail!= null)&&(!this.olbTxnDetail.isEmpty()))?this.getOLBTxnDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbTxnDetail", theOLBTxnDetail), currentHashCode, theOLBTxnDetail, ((this.olbTxnDetail!= null)&&(!this.olbTxnDetail.isEmpty())));
        }
        {
            Integer theStartPosition;
            theStartPosition = this.getStartPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startPosition", theStartPosition), currentHashCode, theStartPosition, (this.startPosition!= null));
        }
        {
            Integer theMaxResults;
            theMaxResults = this.getMaxResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxResults", theMaxResults), currentHashCode, theMaxResults, (this.maxResults!= null));
        }
        {
            Integer theTotalCount;
            theTotalCount = this.getTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCount", theTotalCount), currentHashCode, theTotalCount, (this.totalCount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
