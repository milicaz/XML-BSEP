//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 01:09:02 PM CEST 
//


package rs.gov.parlament.amandman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDeo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Glava">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.parlament.gov.rs/amandman}TGlava">
 *                 &lt;attribute name="Naziv" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Oznaka" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDeo", propOrder = {
    "glava"
})
@XmlSeeAlso({
    rs.gov.parlament.amandman.UnutrasnjaPodela.Deo.class
})
public class TDeo {

    @XmlElement(name = "Glava", required = true)
    protected TDeo.Glava glava;

    /**
     * Gets the value of the glava property.
     * 
     * @return
     *     possible object is
     *     {@link TDeo.Glava }
     *     
     */
    public TDeo.Glava getGlava() {
        return glava;
    }

    /**
     * Sets the value of the glava property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDeo.Glava }
     *     
     */
    public void setGlava(TDeo.Glava value) {
        this.glava = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.parlament.gov.rs/amandman}TGlava">
     *       &lt;attribute name="Naziv" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Oznaka" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Glava
        extends TGlava
    {

        @XmlAttribute(name = "Naziv")
        @XmlSchemaType(name = "anySimpleType")
        protected String naziv;
        @XmlAttribute(name = "Oznaka")
        @XmlSchemaType(name = "anySimpleType")
        protected String oznaka;

        /**
         * Gets the value of the naziv property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaziv() {
            return naziv;
        }

        /**
         * Sets the value of the naziv property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaziv(String value) {
            this.naziv = value;
        }

        /**
         * Gets the value of the oznaka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOznaka() {
            return oznaka;
        }

        /**
         * Sets the value of the oznaka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOznaka(String value) {
            this.oznaka = value;
        }

    }

}
