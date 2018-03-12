
package com.secunet.ipsmall.tobuilder.ics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r CardReaderInterfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CardReaderInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="supported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardReaderInterfaceType", namespace = "http://www.secunet.com")
public class CardReaderInterfaceType {

    @XmlAttribute(name = "supported", required = true)
    protected boolean supported;

    /**
     * Ruft den Wert der supported-Eigenschaft ab.
     * 
     */
    public boolean isSupported() {
        return supported;
    }

    /**
     * Legt den Wert der supported-Eigenschaft fest.
     * 
     */
    public void setSupported(boolean value) {
        this.supported = value;
    }

}
