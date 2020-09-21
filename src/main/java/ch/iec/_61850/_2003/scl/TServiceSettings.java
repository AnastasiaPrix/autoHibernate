//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for tServiceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServiceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cbName" type="{http://www.iec.ch/61850/2003/SCL}tServiceSettingsEnum" default="Fix" />
 *       &lt;attribute name="datSet" type="{http://www.iec.ch/61850/2003/SCL}tServiceSettingsEnum" default="Fix" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServiceSettings")
@XmlSeeAlso({
    TReportSettings.class,
    TLogSettings.class,
    TSMVSettings.class,
    TGSESettings.class
})
@Entity(name = "TServiceSettings")
@Table(name = "TSERVICE_SETTINGS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TServiceSettings
    implements Equals, HashCode
{

    @XmlAttribute(name = "cbName")
    protected TServiceSettingsEnum cbName;
    @XmlAttribute(name = "datSet")
    protected TServiceSettingsEnum datSet;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the cbName property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    @Basic
    @Column(name = "CB_NAME", length = 255)
    @Enumerated(EnumType.STRING)
    public TServiceSettingsEnum getCbName() {
        if (cbName == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return cbName;
        }
    }

    /**
     * Sets the value of the cbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setCbName(TServiceSettingsEnum value) {
        this.cbName = value;
    }

    /**
     * Gets the value of the datSet property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    @Basic
    @Column(name = "DAT_SET", length = 255)
    @Enumerated(EnumType.STRING)
    public TServiceSettingsEnum getDatSet() {
        if (datSet == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return datSet;
        }
    }

    /**
     * Sets the value of the datSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setDatSet(TServiceSettingsEnum value) {
        this.datSet = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TServiceSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TServiceSettings that = ((TServiceSettings) object);
        {
            TServiceSettingsEnum lhsCbName;
            lhsCbName = this.getCbName();
            TServiceSettingsEnum rhsCbName;
            rhsCbName = that.getCbName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cbName", lhsCbName), LocatorUtils.property(thatLocator, "cbName", rhsCbName), lhsCbName, rhsCbName)) {
                return false;
            }
        }
        {
            TServiceSettingsEnum lhsDatSet;
            lhsDatSet = this.getDatSet();
            TServiceSettingsEnum rhsDatSet;
            rhsDatSet = that.getDatSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datSet", lhsDatSet), LocatorUtils.property(thatLocator, "datSet", rhsDatSet), lhsDatSet, rhsDatSet)) {
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
            TServiceSettingsEnum theCbName;
            theCbName = this.getCbName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cbName", theCbName), currentHashCode, theCbName);
        }
        {
            TServiceSettingsEnum theDatSet;
            theDatSet = this.getDatSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datSet", theDatSet), currentHashCode, theDatSet);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}