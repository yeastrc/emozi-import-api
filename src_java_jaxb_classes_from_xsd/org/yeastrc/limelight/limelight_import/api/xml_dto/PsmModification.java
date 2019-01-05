//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.04 at 04:35:28 PM PST 
//


package org.yeastrc.limelight.limelight_import.api.xml_dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mass" use="required" type="{}mass" />
 *       &lt;attribute name="position" type="{}peptide_position" />
 *       &lt;attribute name="is_n_terminal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is_c_terminal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "psm_modification")
public class PsmModification {

    @XmlAttribute(name = "mass", required = true)
    protected BigDecimal mass;
    @XmlAttribute(name = "position")
    protected BigInteger position;
    @XmlAttribute(name = "is_n_terminal")
    protected Boolean isNTerminal;
    @XmlAttribute(name = "is_c_terminal")
    protected Boolean isCTerminal;

    /**
     * Gets the value of the mass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMass(BigDecimal value) {
        this.mass = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the isNTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNTerminal() {
        return isNTerminal;
    }

    /**
     * Sets the value of the isNTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNTerminal(Boolean value) {
        this.isNTerminal = value;
    }

    /**
     * Gets the value of the isCTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCTerminal() {
        return isCTerminal;
    }

    /**
     * Sets the value of the isCTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCTerminal(Boolean value) {
        this.isCTerminal = value;
    }

}
