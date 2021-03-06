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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tServer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tUnNaming">
 *       &lt;sequence>
 *         &lt;element name="Authentication">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.iec.ch/61850/2003/SCL}agAuthentication"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LDevice" type="{http://www.iec.ch/61850/2003/SCL}tLDevice" maxOccurs="unbounded"/>
 *         &lt;element name="Association" type="{http://www.iec.ch/61850/2003/SCL}tAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="30" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tServer", propOrder = {
    "authentication",
    "lDevice",
    "association"
})
@Entity(name = "TServer")
@Table(name = "TSERVER")
public class TServer
    extends TUnNaming
    implements Equals, HashCode
{

    @XmlElement(name = "Authentication", required = true)
    protected TServer.Authentication authentication;
    @XmlElement(name = "LDevice", required = true)
    protected List<TLDevice> lDevice;
    @XmlElement(name = "Association")
    protected List<TAssociation> association;
    @XmlAttribute(name = "timeout")
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeout;

    /**
     * Gets the value of the authentication property.
     *
     * @return
     *     possible object is
     *     {@link TServer.Authentication }
     *
     */
    @ManyToOne(targetEntity = TServer.Authentication.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHENTICATION_TSERVER_HJID")
    public TServer.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     *
     * @param value
     *     allowed object is
     *     {@link TServer.Authentication }
     *
     */
    public void setAuthentication(TServer.Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the lDevice property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lDevice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLDevice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLDevice }
     *
     *
     */
    @OneToMany(targetEntity = TLDevice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LDEVICE_TSERVER_HJID")
    public List<TLDevice> getLDevice() {
        if (lDevice == null) {
            lDevice = new ArrayList<TLDevice>();
        }
        return this.lDevice;
    }

    /**
     *
     *
     */
    public void setLDevice(List<TLDevice> lDevice) {
        this.lDevice = lDevice;
    }

    /**
     * Gets the value of the association property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAssociation }
     *
     *
     */
    @OneToMany(targetEntity = TAssociation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASSOCIATION_TSERVER_HJID")
    public List<TAssociation> getAssociation() {
        if (association == null) {
            association = new ArrayList<TAssociation>();
        }
        return this.association;
    }

    /**
     *
     *
     */
    public void setAssociation(List<TAssociation> association) {
        this.association = association;
    }

    /**
     * Gets the value of the timeout property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @Basic
    @Column(name = "TIMEOUT", precision = 10, scale = 0)
    public long getTimeout() {
        if (timeout == null) {
            return  30L;
        } else {
            return timeout;
        }
    }

    /**
     * Sets the value of the timeout property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTimeout(Long value) {
        this.timeout = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TServer)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TServer that = ((TServer) object);
        {
            TServer.Authentication lhsAuthentication;
            lhsAuthentication = this.getAuthentication();
            TServer.Authentication rhsAuthentication;
            rhsAuthentication = that.getAuthentication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authentication", lhsAuthentication), LocatorUtils.property(thatLocator, "authentication", rhsAuthentication), lhsAuthentication, rhsAuthentication)) {
                return false;
            }
        }
        {
            List<TLDevice> lhsLDevice;
            lhsLDevice = (((this.lDevice!= null)&&(!this.lDevice.isEmpty()))?this.getLDevice():null);
            List<TLDevice> rhsLDevice;
            rhsLDevice = (((that.lDevice!= null)&&(!that.lDevice.isEmpty()))?that.getLDevice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lDevice", lhsLDevice), LocatorUtils.property(thatLocator, "lDevice", rhsLDevice), lhsLDevice, rhsLDevice)) {
                return false;
            }
        }
        {
            List<TAssociation> lhsAssociation;
            lhsAssociation = (((this.association!= null)&&(!this.association.isEmpty()))?this.getAssociation():null);
            List<TAssociation> rhsAssociation;
            rhsAssociation = (((that.association!= null)&&(!that.association.isEmpty()))?that.getAssociation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "association", lhsAssociation), LocatorUtils.property(thatLocator, "association", rhsAssociation), lhsAssociation, rhsAssociation)) {
                return false;
            }
        }
        {
            long lhsTimeout;
            lhsTimeout = ((this.timeout!= null)?this.getTimeout(): 0L);
            long rhsTimeout;
            rhsTimeout = ((that.timeout!= null)?that.getTimeout(): 0L);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeout", lhsTimeout), LocatorUtils.property(thatLocator, "timeout", rhsTimeout), lhsTimeout, rhsTimeout)) {
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
            TServer.Authentication theAuthentication;
            theAuthentication = this.getAuthentication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authentication", theAuthentication), currentHashCode, theAuthentication);
        }
        {
            List<TLDevice> theLDevice;
            theLDevice = (((this.lDevice!= null)&&(!this.lDevice.isEmpty()))?this.getLDevice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lDevice", theLDevice), currentHashCode, theLDevice);
        }
        {
            List<TAssociation> theAssociation;
            theAssociation = (((this.association!= null)&&(!this.association.isEmpty()))?this.getAssociation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "association", theAssociation), currentHashCode, theAssociation);
        }
        {
            long theTimeout;
            theTimeout = ((this.timeout!= null)?this.getTimeout(): 0L);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeout", theTimeout), currentHashCode, theTimeout);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.iec.ch/61850/2003/SCL}agAuthentication"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Entity(name = "TServer$Authentication")
    @Table(name = "AUTHENTICATION")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Authentication
        implements Equals, HashCode
    {

        @XmlAttribute(name = "none")
        protected Boolean none;
        @XmlAttribute(name = "password")
        protected Boolean password;
        @XmlAttribute(name = "weak")
        protected Boolean weak;
        @XmlAttribute(name = "strong")
        protected Boolean strong;
        @XmlAttribute(name = "certificate")
        protected Boolean certificate;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the none property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @Basic
        @Column(name = "NONE_")
        public boolean isNone() {
            if (none == null) {
                return true;
            } else {
                return none;
            }
        }

        /**
         * Sets the value of the none property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setNone(Boolean value) {
            this.none = value;
        }

        /**
         * Gets the value of the password property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @Basic
        @Column(name = "PASSWORD_")
        public boolean isPassword() {
            if (password == null) {
                return false;
            } else {
                return password;
            }
        }

        /**
         * Sets the value of the password property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPassword(Boolean value) {
            this.password = value;
        }

        /**
         * Gets the value of the weak property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @Basic
        @Column(name = "WEAK")
        public boolean isWeak() {
            if (weak == null) {
                return false;
            } else {
                return weak;
            }
        }

        /**
         * Sets the value of the weak property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setWeak(Boolean value) {
            this.weak = value;
        }

        /**
         * Gets the value of the strong property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @Basic
        @Column(name = "STRONG")
        public boolean isStrong() {
            if (strong == null) {
                return false;
            } else {
                return strong;
            }
        }

        /**
         * Sets the value of the strong property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setStrong(Boolean value) {
            this.strong = value;
        }

        /**
         * Gets the value of the certificate property.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @Basic
        @Column(name = "CERTIFICATE")
        public boolean isCertificate() {
            if (certificate == null) {
                return false;
            } else {
                return certificate;
            }
        }

        /**
         * Sets the value of the certificate property.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setCertificate(Boolean value) {
            this.certificate = value;
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
            if (!(object instanceof TServer.Authentication)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final TServer.Authentication that = ((TServer.Authentication) object);
            {
                boolean lhsNone;
                lhsNone = ((this.none!= null)?this.isNone():false);
                boolean rhsNone;
                rhsNone = ((that.none!= null)?that.isNone():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "none", lhsNone), LocatorUtils.property(thatLocator, "none", rhsNone), lhsNone, rhsNone)) {
                    return false;
                }
            }
            {
                boolean lhsPassword;
                lhsPassword = ((this.password!= null)?this.isPassword():false);
                boolean rhsPassword;
                rhsPassword = ((that.password!= null)?that.isPassword():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword)) {
                    return false;
                }
            }
            {
                boolean lhsWeak;
                lhsWeak = ((this.weak!= null)?this.isWeak():false);
                boolean rhsWeak;
                rhsWeak = ((that.weak!= null)?that.isWeak():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "weak", lhsWeak), LocatorUtils.property(thatLocator, "weak", rhsWeak), lhsWeak, rhsWeak)) {
                    return false;
                }
            }
            {
                boolean lhsStrong;
                lhsStrong = ((this.strong!= null)?this.isStrong():false);
                boolean rhsStrong;
                rhsStrong = ((that.strong!= null)?that.isStrong():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "strong", lhsStrong), LocatorUtils.property(thatLocator, "strong", rhsStrong), lhsStrong, rhsStrong)) {
                    return false;
                }
            }
            {
                boolean lhsCertificate;
                lhsCertificate = ((this.certificate!= null)?this.isCertificate():false);
                boolean rhsCertificate;
                rhsCertificate = ((that.certificate!= null)?that.isCertificate():false);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "certificate", lhsCertificate), LocatorUtils.property(thatLocator, "certificate", rhsCertificate), lhsCertificate, rhsCertificate)) {
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
                boolean theNone;
                theNone = ((this.none!= null)?this.isNone():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "none", theNone), currentHashCode, theNone);
            }
            {
                boolean thePassword;
                thePassword = ((this.password!= null)?this.isPassword():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword);
            }
            {
                boolean theWeak;
                theWeak = ((this.weak!= null)?this.isWeak():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weak", theWeak), currentHashCode, theWeak);
            }
            {
                boolean theStrong;
                theStrong = ((this.strong!= null)?this.isStrong():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strong", theStrong), currentHashCode, theStrong);
            }
            {
                boolean theCertificate;
                theCertificate = ((this.certificate!= null)?this.isCertificate():false);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificate", theCertificate), currentHashCode, theCertificate);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
