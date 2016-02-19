/*
 
    Copyright IBM Corp. 2012, 2016
    This file is part of Anomaly Detection Engine for Linux Logs (ADE).

    ADE is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ADE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ADE.  If not, see <http://www.gnu.org/licenses/>.
 
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.06 at 05:15:48 PM IDT 
//

package org.openmainframe.ade.impl.flow.factory.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ScoringSchemaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoringSchemaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScorerClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ScorerProperty" type="{http://flow.impl.ade.openmainframe.org/factory}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkedScorer" type="{http://flow.impl.ade.openmainframe.org/factory}LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrainingFramingFlow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DependsOn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScoredEntity" use="required" type="{http://flow.impl.ade.openmainframe.org/factory}ScoredEntityEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoringSchemaType", namespace = "http://flow.impl.ade.openmainframe.org/factory", propOrder = {
        "scorerClass",
        "scorerProperty",
        "linkedScorer",
        "trainingFramingFlow",
        "dependsOn"
})
public class ScoringSchemaType {

    @XmlElement(name = "ScorerClass", required = true)
    protected String scorerClass;
    @XmlElement(name = "ScorerProperty")
    protected List<PropertyType> scorerProperty;
    @XmlElement(name = "LinkedScorer")
    protected List<LinkType> linkedScorer;
    @XmlElement(name = "TrainingFramingFlow")
    protected String trainingFramingFlow;
    @XmlElement(name = "DependsOn")
    protected List<String> dependsOn;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(name = "ScoredEntity", required = true)
    protected ScoredEntityEnum scoredEntity;

    /**
     * Gets the value of the scorerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorerClass() {
        return scorerClass;
    }

    /**
     * Sets the value of the scorerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorerClass(String value) {
        this.scorerClass = value;
    }

    /**
     * Gets the value of the scorerProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorerProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorerProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getScorerProperty() {
        if (scorerProperty == null) {
            scorerProperty = new ArrayList<PropertyType>();
        }
        return this.scorerProperty;
    }

    /**
     * Gets the value of the linkedScorer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedScorer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedScorer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkType }
     * 
     * 
     */
    public List<LinkType> getLinkedScorer() {
        if (linkedScorer == null) {
            linkedScorer = new ArrayList<LinkType>();
        }
        return this.linkedScorer;
    }

    /**
     * Gets the value of the trainingFramingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingFramingFlow() {
        return trainingFramingFlow;
    }

    /**
     * Sets the value of the trainingFramingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingFramingFlow(String value) {
        this.trainingFramingFlow = value;
    }

    /**
     * Gets the value of the dependsOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependsOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependsOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new ArrayList<String>();
        }
        return this.dependsOn;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the scoredEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ScoredEntityEnum }
     *     
     */
    public ScoredEntityEnum getScoredEntity() {
        return scoredEntity;
    }

    /**
     * Sets the value of the scoredEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoredEntityEnum }
     *     
     */
    public void setScoredEntity(ScoredEntityEnum value) {
        this.scoredEntity = value;
    }

}