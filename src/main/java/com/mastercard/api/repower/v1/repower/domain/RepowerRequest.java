//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 12:00:33 PM CST 
//


package com.mastercard.api.repower.v1.repower.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="TransactionReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TransactionAmount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ICA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProcessorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RoutingAndTransitNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MerchantType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="CardAcceptor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
    "transactionReference",
    "cardNumber",
    "transactionAmount",
    "localDate",
    "localTime",
    "channel",
    "ica",
    "processorId",
    "routingAndTransitNumber",
    "merchantType",
    "cardAcceptor"
})
@XmlRootElement(name = "RepowerRequest")
public class RepowerRequest {

    @XmlElement(name = "TransactionReference", required = true)
    protected String transactionReference;
    @XmlElement(name = "CardNumber")
    protected long cardNumber;
    @XmlElement(name = "TransactionAmount", required = true)
    protected TransactionAmount transactionAmount;
    @XmlElement(name = "LocalDate", required = true)
    protected String localDate;
    @XmlElement(name = "LocalTime", required = true)
    protected String localTime;
    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "ICA")
    protected String ica;
    @XmlElement(name = "ProcessorId")
    protected long processorId;
    @XmlElement(name = "RoutingAndTransitNumber")
    protected int routingAndTransitNumber;
    @XmlElement(name = "MerchantType")
    protected short merchantType;
    @XmlElement(name = "CardAcceptor", required = true)
    protected CardAcceptor cardAcceptor;

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReference(String value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     */
    public long getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     */
    public void setCardNumber(long value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.repower.v1.repower.domain.RepowerRequest.TransactionAmount }
     *     
     */
    public TransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.repower.v1.repower.domain.RepowerRequest.TransactionAmount }
     *     
     */
    public void setTransactionAmount(TransactionAmount value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the localDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDate() {
        return localDate;
    }

    /**
     * Sets the value of the localDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDate(String value) {
        this.localDate = value;
    }

    /**
     * Gets the value of the localTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTime() {
        return localTime;
    }

    /**
     * Sets the value of the localTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTime(String value) {
        this.localTime = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the ica property.
     * 
     */
    public String getICA() {
        return ica;
    }

    /**
     * Sets the value of the ica property.
     * 
     */
    public void setICA(String value) {
        this.ica = value;
    }

    /**
     * Gets the value of the processorId property.
     * 
     */
    public long getProcessorId() {
        return processorId;
    }

    /**
     * Sets the value of the processorId property.
     * 
     */
    public void setProcessorId(long value) {
        this.processorId = value;
    }

    /**
     * Gets the value of the routingAndTransitNumber property.
     * 
     */
    public int getRoutingAndTransitNumber() {
        return routingAndTransitNumber;
    }

    /**
     * Sets the value of the routingAndTransitNumber property.
     * 
     */
    public void setRoutingAndTransitNumber(int value) {
        this.routingAndTransitNumber = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     */
    public short getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     */
    public void setMerchantType(short value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the cardAcceptor property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.repower.v1.repower.domain.RepowerRequest.CardAcceptor }
     *     
     */
    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    /**
     * Sets the value of the cardAcceptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.repower.v1.repower.domain.RepowerRequest.CardAcceptor }
     *     
     */
    public void setCardAcceptor(CardAcceptor value) {
        this.cardAcceptor = value;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "city",
        "state",
        "postalCode",
        "country"
    })
    public static class CardAcceptor {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "City", required = true)
        protected String city;
        @XmlElement(name = "State", required = true)
        protected String state;
        @XmlElement(name = "PostalCode", required = true)
        protected String postalCode;
        @XmlElement(name = "Country", required = true)
        protected String country;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the postalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
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
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "value",
        "currency"
    })
    public static class TransactionAmount {

        @XmlElement(name = "Value")
        protected long value;
        @XmlElement(name = "Currency", required = true)
        protected String currency;

        /**
         * Gets the value of the value property.
         * 
         */
        public long getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(long value) {
            this.value = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

}
