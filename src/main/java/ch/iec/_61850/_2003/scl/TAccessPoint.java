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
 * <p>Java class for tAccessPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAccessPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2003/SCL}tNaming">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Server" type="{http://www.iec.ch/61850/2003/SCL}tServer"/>
 *         &lt;element ref="{http://www.iec.ch/61850/2003/SCL}LN" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="router" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="clock" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAccessPoint", propOrder = {
    "server",
    "ln"
})
@Entity(name = "TAccessPoint")
@Table(name = "TACCESS_POINT")
public class TAccessPoint
    extends TNaming
    implements Equals, HashCode
{

    @XmlElement(name = "Server")
    protected TServer server;
    @XmlElement(name = "LN")
    protected List<TLN> ln;
    @XmlAttribute(name = "router")
    protected Boolean router;
    @XmlAttribute(name = "clock")
    protected Boolean clock;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link TServer }
     *     
     */
    @ManyToOne(targetEntity = TServer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SERVER_TACCESS_POINT_HJID")
    public TServer getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServer }
     *     
     */
    public void setServer(TServer value) {
        this.server = value;
    }

    /**
     * Gets the value of the ln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLN }
     * 
     * 
     */
    @OneToMany(targetEntity = TLN.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LN_TACCESS_POINT_HJID")
    public List<TLN> getLN() {
        if (ln == null) {
            ln = new ArrayList<TLN>();
        }
        return this.ln;
    }

    /**
     * 
     * 
     */
    public void setLN(List<TLN> ln) {
        this.ln = ln;
    }

    /**
     * Gets the value of the router property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "ROUTER")
    public boolean isRouter() {
        if (router == null) {
            return false;
        } else {
            return router;
        }
    }

    /**
     * Sets the value of the router property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouter(Boolean value) {
        this.router = value;
    }

    /**
     * Gets the value of the clock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "CLOCK")
    public boolean isClock() {
        if (clock == null) {
            return false;
        } else {
            return clock;
        }
    }

    /**
     * Sets the value of the clock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClock(Boolean value) {
        this.clock = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TAccessPoint)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TAccessPoint that = ((TAccessPoint) object);
        {
            TServer lhsServer;
            lhsServer = this.getServer();
            TServer rhsServer;
            rhsServer = that.getServer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "server", lhsServer), LocatorUtils.property(thatLocator, "server", rhsServer), lhsServer, rhsServer)) {
                return false;
            }
        }
        {
            List<TLN> lhsLN;
            lhsLN = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLN():null);
            List<TLN> rhsLN;
            rhsLN = (((that.ln!= null)&&(!that.ln.isEmpty()))?that.getLN():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ln", lhsLN), LocatorUtils.property(thatLocator, "ln", rhsLN), lhsLN, rhsLN)) {
                return false;
            }
        }
        {
            boolean lhsRouter;
            lhsRouter = ((this.router!= null)?this.isRouter():false);
            boolean rhsRouter;
            rhsRouter = ((that.router!= null)?that.isRouter():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "router", lhsRouter), LocatorUtils.property(thatLocator, "router", rhsRouter), lhsRouter, rhsRouter)) {
                return false;
            }
        }
        {
            boolean lhsClock;
            lhsClock = ((this.clock!= null)?this.isClock():false);
            boolean rhsClock;
            rhsClock = ((that.clock!= null)?that.isClock():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clock", lhsClock), LocatorUtils.property(thatLocator, "clock", rhsClock), lhsClock, rhsClock)) {
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
            TServer theServer;
            theServer = this.getServer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "server", theServer), currentHashCode, theServer);
        }
        {
            List<TLN> theLN;
            theLN = (((this.ln!= null)&&(!this.ln.isEmpty()))?this.getLN():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ln", theLN), currentHashCode, theLN);
        }
        {
            boolean theRouter;
            theRouter = ((this.router!= null)?this.isRouter():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "router", theRouter), currentHashCode, theRouter);
        }
        {
            boolean theClock;
            theClock = ((this.clock!= null)?this.isClock():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clock", theClock), currentHashCode, theClock);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}