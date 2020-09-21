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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tGSEControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGSEControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tControlWithIEDName">
 *       &lt;attribute name="type" type="{http://www.iec.ch/61850/2003/SCL}tGSEControlTypeEnum" default="GOOSE" />
 *       &lt;attribute name="appID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGSEControl")
@Entity(name = "TGSEControl")
@Table(name = "TGSECONTROL")
public class TGSEControl
    extends TControlWithIEDName
    implements Equals, HashCode
{

    @XmlAttribute(name = "type")
    protected TGSEControlTypeEnum type;
    @XmlAttribute(name = "appID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String appID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TGSEControlTypeEnum }
     *     
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    @Enumerated(EnumType.STRING)
    public TGSEControlTypeEnum getType() {
        if (type == null) {
            return TGSEControlTypeEnum.GOOSE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGSEControlTypeEnum }
     *     
     */
    public void setType(TGSEControlTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "APP_ID", length = 255)
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TGSEControl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TGSEControl that = ((TGSEControl) object);
        {
            TGSEControlTypeEnum lhsType;
            lhsType = this.getType();
            TGSEControlTypeEnum rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsAppID;
            lhsAppID = this.getAppID();
            String rhsAppID;
            rhsAppID = that.getAppID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appID", lhsAppID), LocatorUtils.property(thatLocator, "appID", rhsAppID), lhsAppID, rhsAppID)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TGSEControlTypeEnum theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theAppID;
            theAppID = this.getAppID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appID", theAppID), currentHashCode, theAppID);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
