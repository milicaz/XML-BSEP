//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 05:01:58 PM CEST 
//


package rs.gov.parlament.odluka;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="Deo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.parlament.gov.rs/odluka}TDeo">
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
@XmlType(name = "", propOrder = {
    "deo"
})
@XmlRootElement(name = "Unutrasnja_podela")
public class UnutrasnjaPodela {

    @XmlElement(name = "Deo", required = true)
    protected UnutrasnjaPodela.Deo deo;

    /**
     * Gets the value of the deo property.
     * 
     * @return
     *     possible object is
     *     {@link UnutrasnjaPodela.Deo }
     *     
     */
    public UnutrasnjaPodela.Deo getDeo() {
        return deo;
    }

    /**
     * Sets the value of the deo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnutrasnjaPodela.Deo }
     *     
     */
    public void setDeo(UnutrasnjaPodela.Deo value) {
        this.deo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.parlament.gov.rs/odluka}TDeo">
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
    public static class Deo
        extends TDeo
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
