//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 01:08:35 PM CEST 
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
 *       &lt;choice>
 *         &lt;element name="Usvojeni_akt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Usvojen_od" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Usvojen_na_osnovu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Datum_pocetka_primene" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Akt_u_proceduri">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Predlagac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Odbor_za_ramatranje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Datum_ulaska_u_proceduru" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usvojeniAkt",
    "aktUProceduri"
})
@XmlRootElement(name = "Glavni_deo")
public class GlavniDeo {

    @XmlElement(name = "Usvojeni_akt")
    protected GlavniDeo.UsvojeniAkt usvojeniAkt;
    @XmlElement(name = "Akt_u_proceduri")
    protected GlavniDeo.AktUProceduri aktUProceduri;

    /**
     * Gets the value of the usvojeniAkt property.
     * 
     * @return
     *     possible object is
     *     {@link GlavniDeo.UsvojeniAkt }
     *     
     */
    public GlavniDeo.UsvojeniAkt getUsvojeniAkt() {
        return usvojeniAkt;
    }

    /**
     * Sets the value of the usvojeniAkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlavniDeo.UsvojeniAkt }
     *     
     */
    public void setUsvojeniAkt(GlavniDeo.UsvojeniAkt value) {
        this.usvojeniAkt = value;
    }

    /**
     * Gets the value of the aktUProceduri property.
     * 
     * @return
     *     possible object is
     *     {@link GlavniDeo.AktUProceduri }
     *     
     */
    public GlavniDeo.AktUProceduri getAktUProceduri() {
        return aktUProceduri;
    }

    /**
     * Sets the value of the aktUProceduri property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlavniDeo.AktUProceduri }
     *     
     */
    public void setAktUProceduri(GlavniDeo.AktUProceduri value) {
        this.aktUProceduri = value;
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
     *       &lt;sequence>
     *         &lt;element name="Predlagac" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Odbor_za_ramatranje" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Datum_ulaska_u_proceduru" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "predlagac",
        "odborZaRamatranje"
    })
    public static class AktUProceduri {

        @XmlElement(name = "Predlagac", required = true)
        protected String predlagac;
        @XmlElement(name = "Odbor_za_ramatranje", required = true)
        protected String odborZaRamatranje;
        @XmlAttribute(name = "Datum_ulaska_u_proceduru")
        @XmlSchemaType(name = "anySimpleType")
        protected String datumUlaskaUProceduru;

        /**
         * Gets the value of the predlagac property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPredlagac() {
            return predlagac;
        }

        /**
         * Sets the value of the predlagac property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPredlagac(String value) {
            this.predlagac = value;
        }

        /**
         * Gets the value of the odborZaRamatranje property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOdborZaRamatranje() {
            return odborZaRamatranje;
        }

        /**
         * Sets the value of the odborZaRamatranje property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOdborZaRamatranje(String value) {
            this.odborZaRamatranje = value;
        }

        /**
         * Gets the value of the datumUlaskaUProceduru property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatumUlaskaUProceduru() {
            return datumUlaskaUProceduru;
        }

        /**
         * Sets the value of the datumUlaskaUProceduru property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatumUlaskaUProceduru(String value) {
            this.datumUlaskaUProceduru = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="Usvojen_od" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Usvojen_na_osnovu" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Datum_pocetka_primene" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "usvojenOd",
        "usvojenNaOsnovu"
    })
    public static class UsvojeniAkt {

        @XmlElement(name = "Usvojen_od", required = true)
        protected String usvojenOd;
        @XmlElement(name = "Usvojen_na_osnovu", required = true)
        protected String usvojenNaOsnovu;
        @XmlAttribute(name = "Datum_pocetka_primene")
        @XmlSchemaType(name = "anySimpleType")
        protected String datumPocetkaPrimene;

        /**
         * Gets the value of the usvojenOd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsvojenOd() {
            return usvojenOd;
        }

        /**
         * Sets the value of the usvojenOd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsvojenOd(String value) {
            this.usvojenOd = value;
        }

        /**
         * Gets the value of the usvojenNaOsnovu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsvojenNaOsnovu() {
            return usvojenNaOsnovu;
        }

        /**
         * Sets the value of the usvojenNaOsnovu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsvojenNaOsnovu(String value) {
            this.usvojenNaOsnovu = value;
        }

        /**
         * Gets the value of the datumPocetkaPrimene property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatumPocetkaPrimene() {
            return datumPocetkaPrimene;
        }

        /**
         * Sets the value of the datumPocetkaPrimene property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatumPocetkaPrimene(String value) {
            this.datumPocetkaPrimene = value;
        }

    }

}
