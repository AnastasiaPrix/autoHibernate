//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.iec.ch/61850/2003/SCL}agLNRef"/>
 *       &lt;attribute name="kind" use="required" type="{http://www.iec.ch/61850/2003/SCL}tAssociationKindEnum" />
 *       &lt;attribute name="associationID" type="{http://www.iec.ch/61850/2003/SCL}tName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAssociation")
@Entity(name = "TAssociation")
@Table(name = "TASSOCIATION")
@Inheritance(strategy = InheritanceType.JOINED)
public class TAssociation
    implements Equals, HashCode
{

    @XmlAttribute(name = "kind", required = true)
    protected TAssociationKindEnum kind;
    @XmlAttribute(name = "associationID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String associationID;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(required = true)
    protected List<String> lnClass;
    @XmlAttribute(name = "lnInst", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lnInst;
    @XmlAttribute(name = "iedName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String iedName;
    @XmlAttribute(name = "ldInst", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ldInst;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<TAssociationLnClassItem> lnClassItems;

    /**
     * Gets the value of the kind property.
     *
     * @return
     *     possible object is
     *     {@link TAssociationKindEnum }
     *
     */
    @Basic
    @Column(name = "KIND", length = 255)
    @Enumerated(EnumType.STRING)
    public TAssociationKindEnum getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     *
     * @param value
     *     allowed object is
     *     {@link TAssociationKindEnum }
     *
     */
    public void setKind(TAssociationKindEnum value) {
        this.kind = value;
    }

    /**
     * Gets the value of the associationID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "ASSOCIATION_ID", length = 255)
    public String getAssociationID() {
        return associationID;
    }

    /**
     * Sets the value of the associationID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssociationID(String value) {
        this.associationID = value;
    }

    /**
     * Gets the value of the prefix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "PREFIX_", length = 255)
    public String getPrefix() {
        if (prefix == null) {
            return "";
        } else {
            return prefix;
        }
    }

    /**
     * Sets the value of the prefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the lnClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    @Transient
    public List<String> getLnClass() {
        if (lnClass == null) {
            lnClass = new ArrayList<String>();
        }
        return this.lnClass;
    }

    /**
     *
     *
     */
    public void setLnClass(List<String> lnClass) {
        this.lnClass = lnClass;
    }

    /**
     * Gets the value of the lnInst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "LN_INST", length = 255)
    public String getLnInst() {
        return lnInst;
    }

    /**
     * Sets the value of the lnInst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLnInst(String value) {
        this.lnInst = value;
    }

    /**
     * Gets the value of the iedName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "IED_NAME", length = 255)
    public String getIedName() {
        return iedName;
    }

    /**
     * Sets the value of the iedName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIedName(String value) {
        this.iedName = value;
    }

    /**
     * Gets the value of the ldInst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "LD_INST", length = 255)
    public String getLdInst() {
        return ldInst;
    }

    /**
     * Sets the value of the ldInst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLdInst(String value) {
        this.ldInst = value;
    }

    /**
     * Gets the value of the hjid property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = TAssociation.TAssociationLnClassItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LN_CLASS_ITEMS_TASSOCIATION__0")
    public List<TAssociationLnClassItem> getLnClassItems() {
        if (this.lnClassItems == null) {
            this.lnClassItems = new ArrayList<TAssociationLnClassItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.lnClass)) {
            this.lnClass = ItemUtils.wrap(this.lnClass, this.lnClassItems, TAssociation.TAssociationLnClassItem.class);
        }
        return this.lnClassItems;
    }

    public void setLnClassItems(List<TAssociationLnClassItem> value) {
        this.lnClass = null;
        this.lnClassItems = null;
        this.lnClassItems = value;
        if (this.lnClassItems == null) {
            this.lnClassItems = new ArrayList<TAssociationLnClassItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.lnClass)) {
            this.lnClass = ItemUtils.wrap(this.lnClass, this.lnClassItems, TAssociation.TAssociationLnClassItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TAssociation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TAssociation that = ((TAssociation) object);
        {
            TAssociationKindEnum lhsKind;
            lhsKind = this.getKind();
            TAssociationKindEnum rhsKind;
            rhsKind = that.getKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kind", lhsKind), LocatorUtils.property(thatLocator, "kind", rhsKind), lhsKind, rhsKind)) {
                return false;
            }
        }
        {
            String lhsAssociationID;
            lhsAssociationID = this.getAssociationID();
            String rhsAssociationID;
            rhsAssociationID = that.getAssociationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "associationID", lhsAssociationID), LocatorUtils.property(thatLocator, "associationID", rhsAssociationID), lhsAssociationID, rhsAssociationID)) {
                return false;
            }
        }
        {
            String lhsPrefix;
            lhsPrefix = this.getPrefix();
            String rhsPrefix;
            rhsPrefix = that.getPrefix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefix", lhsPrefix), LocatorUtils.property(thatLocator, "prefix", rhsPrefix), lhsPrefix, rhsPrefix)) {
                return false;
            }
        }
        {
            List<String> lhsLnClass;
            lhsLnClass = (((this.lnClass!= null)&&(!this.lnClass.isEmpty()))?this.getLnClass():null);
            List<String> rhsLnClass;
            rhsLnClass = (((that.lnClass!= null)&&(!that.lnClass.isEmpty()))?that.getLnClass():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lnClass", lhsLnClass), LocatorUtils.property(thatLocator, "lnClass", rhsLnClass), lhsLnClass, rhsLnClass)) {
                return false;
            }
        }
        {
            String lhsLnInst;
            lhsLnInst = this.getLnInst();
            String rhsLnInst;
            rhsLnInst = that.getLnInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lnInst", lhsLnInst), LocatorUtils.property(thatLocator, "lnInst", rhsLnInst), lhsLnInst, rhsLnInst)) {
                return false;
            }
        }
        {
            String lhsIedName;
            lhsIedName = this.getIedName();
            String rhsIedName;
            rhsIedName = that.getIedName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iedName", lhsIedName), LocatorUtils.property(thatLocator, "iedName", rhsIedName), lhsIedName, rhsIedName)) {
                return false;
            }
        }
        {
            String lhsLdInst;
            lhsLdInst = this.getLdInst();
            String rhsLdInst;
            rhsLdInst = that.getLdInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ldInst", lhsLdInst), LocatorUtils.property(thatLocator, "ldInst", rhsLdInst), lhsLdInst, rhsLdInst)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            TAssociationKindEnum theKind;
            theKind = this.getKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kind", theKind), currentHashCode, theKind);
        }
        {
            String theAssociationID;
            theAssociationID = this.getAssociationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "associationID", theAssociationID), currentHashCode, theAssociationID);
        }
        {
            String thePrefix;
            thePrefix = this.getPrefix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefix", thePrefix), currentHashCode, thePrefix);
        }
        {
            List<String> theLnClass;
            theLnClass = (((this.lnClass!= null)&&(!this.lnClass.isEmpty()))?this.getLnClass():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lnClass", theLnClass), currentHashCode, theLnClass);
        }
        {
            String theLnInst;
            theLnInst = this.getLnInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lnInst", theLnInst), currentHashCode, theLnInst);
        }
        {
            String theIedName;
            theIedName = this.getIedName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iedName", theIedName), currentHashCode, theIedName);
        }
        {
            String theLdInst;
            theLdInst = this.getLdInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ldInst", theLdInst), currentHashCode, theLdInst);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "TAssociation$TAssociationLnClassItem")
    @Table(name = "TASSOCIATION_LN_CLASS_ITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class TAssociationLnClassItem
        implements Item<String>
    {

        @XmlElement(name = "LnClass")
        protected String item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "ITEM")
        public String getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItem(String value) {
            this.item = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

    }

}
