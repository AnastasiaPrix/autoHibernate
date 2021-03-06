//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.13 at 07:58:15 PM MSK 
//


package ch.iec._61850._2003.scl;

import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.JAXBContextUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.ElementAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for tBaseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBaseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.iec.ch/61850/2003/SCL}tText" minOccurs="0"/>
 *         &lt;element name="Private" type="{http://www.iec.ch/61850/2003/SCL}tPrivate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBaseElement", propOrder = {
    "any",
    "text",
    "_private"
})
@XmlSeeAlso({
    TIDNaming.class,
    TNaming.class,
    TUnNaming.class,
    SCL.class
})
@Entity(name = "TBaseElement")
@Table(name = "TBASE_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TBaseElement implements Equals, HashCode
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Text")
    protected TText text;
    @XmlElement(name = "Private")
    protected List<TPrivate> _private;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<TBaseElementAnyItem> anyItems;

    /**
     * Gets the value of the any property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     *
     *
     */
    @Transient
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     *
     *
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link TText }
     *
     */
    @ManyToOne(targetEntity = TText.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TEXT_TBASE_ELEMENT_HJID")
    public TText getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link TText }
     *
     */
    public void setText(TText value) {
        this.text = value;
    }

    /**
     * Gets the value of the private property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the private property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPrivate }
     *
     *
     */
    @OneToMany(targetEntity = TPrivate.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRIVATE_TBASE_ELEMENT_HJID")
    public List<TPrivate> getPrivate() {
        if (_private == null) {
            _private = new ArrayList<TPrivate>();
        }
        return this._private;
    }

    /**
     *
     *
     */
    public void setPrivate(List<TPrivate> _private) {
        this._private = _private;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     *
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     *
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     *
     * @return
     *     always non-null
     */
    @Transient
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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

    @OneToMany(targetEntity = TBaseElement.TBaseElementAnyItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ANY_ITEMS_TBASE_ELEMENT_HJID")
    public List<TBaseElementAnyItem> getAnyItems() {
        if (this.anyItems == null) {
            this.anyItems = new ArrayList<TBaseElementAnyItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.any)) {
            this.any = ItemUtils.wrap(this.any, this.anyItems, TBaseElement.TBaseElementAnyItem.class);
        }
        return this.anyItems;
    }

    public void setAnyItems(List<TBaseElementAnyItem> value) {
        this.any = null;
        this.anyItems = null;
        this.anyItems = value;
        if (this.anyItems == null) {
            this.anyItems = new ArrayList<TBaseElementAnyItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.any)) {
            this.any = ItemUtils.wrap(this.any, this.anyItems, TBaseElement.TBaseElementAnyItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TBaseElement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TBaseElement that = ((TBaseElement) object);
        {
            List<Object> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<Object> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                return false;
            }
        }
        {
            TText lhsText;
            lhsText = this.getText();
            TText rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText)) {
                return false;
            }
        }
        {
            List<TPrivate> lhsPrivate;
            lhsPrivate = (((this._private!= null)&&(!this._private.isEmpty()))?this.getPrivate():null);
            List<TPrivate> rhsPrivate;
            rhsPrivate = (((that._private!= null)&&(!that._private.isEmpty()))?that.getPrivate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_private", lhsPrivate), LocatorUtils.property(thatLocator, "_private", rhsPrivate), lhsPrivate, rhsPrivate)) {
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
            List<Object> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
        }
        {
            TText theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText);
        }
        {
            List<TPrivate> thePrivate;
            thePrivate = (((this._private!= null)&&(!this._private.isEmpty()))?this.getPrivate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_private", thePrivate), currentHashCode, thePrivate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "TBaseElement$TBaseElementAnyItem")
    @Table(name = "TBASE_ELEMENT_ANY_ITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class TBaseElementAnyItem
        implements Item<Object>
    {

        @XmlAnyElement(lax = true)
        protected Object item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "ch.iec._61850._2003.scl";

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
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

        @Basic
        @Column(name = "ITEM_ELEMENT")
        @Lob
        public String getItemElement() {
            if (this.getItem() instanceof Element) {
                return XmlAdapterUtils.unmarshall(ElementAsString.class, ((Element) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemElement(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshall(ElementAsString.class, target));
            }
        }

        @Basic
        @Column(name = "ITEM_OBJECT")
        @Lob
        public String getItemObject() {
            if (JAXBContextUtils.isElement(ItemObjectContextPath, this.getItem())) {
                return JAXBContextUtils.marshal(ItemObjectContextPath, this.getItem());
            } else {
                return null;
            }
        }

        public void setItemObject(String target) {
            if (target!= null) {
                setItem(JAXBContextUtils.unmarshal(ItemObjectContextPath, target));
            }
        }

    }

}
