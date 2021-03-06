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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tGSESettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGSESettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tServiceSettings">
 *       &lt;attribute name="appID" type="{http://www.iec.ch/61850/2003/SCL}tServiceSettingsEnum" default="Fix" />
 *       &lt;attribute name="dataLabel" type="{http://www.iec.ch/61850/2003/SCL}tServiceSettingsEnum" default="Fix" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGSESettings")
@Entity(name = "TGSESettings")
@Table(name = "TGSESETTINGS")
public class TGSESettings
    extends TServiceSettings
    implements Equals, HashCode
{

    @XmlAttribute(name = "appID")
    protected TServiceSettingsEnum appID;
    @XmlAttribute(name = "dataLabel")
    protected TServiceSettingsEnum dataLabel;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    @Basic
    @Column(name = "APP_ID", length = 255)
    @Enumerated(EnumType.STRING)
    public TServiceSettingsEnum getAppID() {
        if (appID == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return appID;
        }
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setAppID(TServiceSettingsEnum value) {
        this.appID = value;
    }

    /**
     * Gets the value of the dataLabel property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    @Basic
    @Column(name = "DATA_LABEL", length = 255)
    @Enumerated(EnumType.STRING)
    public TServiceSettingsEnum getDataLabel() {
        if (dataLabel == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return dataLabel;
        }
    }

    /**
     * Sets the value of the dataLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setDataLabel(TServiceSettingsEnum value) {
        this.dataLabel = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TGSESettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TGSESettings that = ((TGSESettings) object);
        {
            TServiceSettingsEnum lhsAppID;
            lhsAppID = this.getAppID();
            TServiceSettingsEnum rhsAppID;
            rhsAppID = that.getAppID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appID", lhsAppID), LocatorUtils.property(thatLocator, "appID", rhsAppID), lhsAppID, rhsAppID)) {
                return false;
            }
        }
        {
            TServiceSettingsEnum lhsDataLabel;
            lhsDataLabel = this.getDataLabel();
            TServiceSettingsEnum rhsDataLabel;
            rhsDataLabel = that.getDataLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataLabel", lhsDataLabel), LocatorUtils.property(thatLocator, "dataLabel", rhsDataLabel), lhsDataLabel, rhsDataLabel)) {
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
            TServiceSettingsEnum theAppID;
            theAppID = this.getAppID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appID", theAppID), currentHashCode, theAppID);
        }
        {
            TServiceSettingsEnum theDataLabel;
            theDataLabel = this.getDataLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataLabel", theDataLabel), currentHashCode, theDataLabel);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
