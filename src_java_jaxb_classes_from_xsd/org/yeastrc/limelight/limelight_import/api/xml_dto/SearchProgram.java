//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 01:00:07 PM PDT 
//


package org.yeastrc.limelight.limelight_import.api.xml_dto;

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
 *         &lt;element name="psm_annotation_types" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_psm_annotation_types" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_psm_annotation_types" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reported_peptide_annotation_types" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_reported_peptide_annotation_types" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_reported_peptide_annotation_types" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="matched_protein_annotation_types" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_matched_protein_annotation_types" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_matched_protein_annotation_types" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="display_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psmAnnotationTypes",
    "reportedPeptideAnnotationTypes",
    "matchedProteinAnnotationTypes"
})
@XmlRootElement(name = "search_program")
public class SearchProgram {

    @XmlElement(name = "psm_annotation_types")
    protected SearchProgram.PsmAnnotationTypes psmAnnotationTypes;
    @XmlElement(name = "reported_peptide_annotation_types")
    protected SearchProgram.ReportedPeptideAnnotationTypes reportedPeptideAnnotationTypes;
    @XmlElement(name = "matched_protein_annotation_types")
    protected SearchProgram.MatchedProteinAnnotationTypes matchedProteinAnnotationTypes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "display_name")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the psmAnnotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgram.PsmAnnotationTypes }
     *     
     */
    public SearchProgram.PsmAnnotationTypes getPsmAnnotationTypes() {
        return psmAnnotationTypes;
    }

    /**
     * Sets the value of the psmAnnotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgram.PsmAnnotationTypes }
     *     
     */
    public void setPsmAnnotationTypes(SearchProgram.PsmAnnotationTypes value) {
        this.psmAnnotationTypes = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgram.ReportedPeptideAnnotationTypes }
     *     
     */
    public SearchProgram.ReportedPeptideAnnotationTypes getReportedPeptideAnnotationTypes() {
        return reportedPeptideAnnotationTypes;
    }

    /**
     * Sets the value of the reportedPeptideAnnotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgram.ReportedPeptideAnnotationTypes }
     *     
     */
    public void setReportedPeptideAnnotationTypes(SearchProgram.ReportedPeptideAnnotationTypes value) {
        this.reportedPeptideAnnotationTypes = value;
    }

    /**
     * Gets the value of the matchedProteinAnnotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgram.MatchedProteinAnnotationTypes }
     *     
     */
    public SearchProgram.MatchedProteinAnnotationTypes getMatchedProteinAnnotationTypes() {
        return matchedProteinAnnotationTypes;
    }

    /**
     * Sets the value of the matchedProteinAnnotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgram.MatchedProteinAnnotationTypes }
     *     
     */
    public void setMatchedProteinAnnotationTypes(SearchProgram.MatchedProteinAnnotationTypes value) {
        this.matchedProteinAnnotationTypes = value;
    }

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *         &lt;element ref="{}filterable_matched_protein_annotation_types" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_matched_protein_annotation_types" minOccurs="0"/>
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
        "filterableMatchedProteinAnnotationTypes",
        "descriptiveMatchedProteinAnnotationTypes"
    })
    public static class MatchedProteinAnnotationTypes {

        @XmlElement(name = "filterable_matched_protein_annotation_types")
        protected FilterableMatchedProteinAnnotationTypes filterableMatchedProteinAnnotationTypes;
        @XmlElement(name = "descriptive_matched_protein_annotation_types")
        protected DescriptiveMatchedProteinAnnotationTypes descriptiveMatchedProteinAnnotationTypes;

        /**
         * Gets the value of the filterableMatchedProteinAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link FilterableMatchedProteinAnnotationTypes }
         *     
         */
        public FilterableMatchedProteinAnnotationTypes getFilterableMatchedProteinAnnotationTypes() {
            return filterableMatchedProteinAnnotationTypes;
        }

        /**
         * Sets the value of the filterableMatchedProteinAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterableMatchedProteinAnnotationTypes }
         *     
         */
        public void setFilterableMatchedProteinAnnotationTypes(FilterableMatchedProteinAnnotationTypes value) {
            this.filterableMatchedProteinAnnotationTypes = value;
        }

        /**
         * Gets the value of the descriptiveMatchedProteinAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptiveMatchedProteinAnnotationTypes }
         *     
         */
        public DescriptiveMatchedProteinAnnotationTypes getDescriptiveMatchedProteinAnnotationTypes() {
            return descriptiveMatchedProteinAnnotationTypes;
        }

        /**
         * Sets the value of the descriptiveMatchedProteinAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptiveMatchedProteinAnnotationTypes }
         *     
         */
        public void setDescriptiveMatchedProteinAnnotationTypes(DescriptiveMatchedProteinAnnotationTypes value) {
            this.descriptiveMatchedProteinAnnotationTypes = value;
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
     *         &lt;element ref="{}filterable_psm_annotation_types" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_psm_annotation_types" minOccurs="0"/>
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
        "filterablePsmAnnotationTypes",
        "descriptivePsmAnnotationTypes"
    })
    public static class PsmAnnotationTypes {

        @XmlElement(name = "filterable_psm_annotation_types")
        protected FilterablePsmAnnotationTypes filterablePsmAnnotationTypes;
        @XmlElement(name = "descriptive_psm_annotation_types")
        protected DescriptivePsmAnnotationTypes descriptivePsmAnnotationTypes;

        /**
         * Gets the value of the filterablePsmAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link FilterablePsmAnnotationTypes }
         *     
         */
        public FilterablePsmAnnotationTypes getFilterablePsmAnnotationTypes() {
            return filterablePsmAnnotationTypes;
        }

        /**
         * Sets the value of the filterablePsmAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterablePsmAnnotationTypes }
         *     
         */
        public void setFilterablePsmAnnotationTypes(FilterablePsmAnnotationTypes value) {
            this.filterablePsmAnnotationTypes = value;
        }

        /**
         * Gets the value of the descriptivePsmAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptivePsmAnnotationTypes }
         *     
         */
        public DescriptivePsmAnnotationTypes getDescriptivePsmAnnotationTypes() {
            return descriptivePsmAnnotationTypes;
        }

        /**
         * Sets the value of the descriptivePsmAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptivePsmAnnotationTypes }
         *     
         */
        public void setDescriptivePsmAnnotationTypes(DescriptivePsmAnnotationTypes value) {
            this.descriptivePsmAnnotationTypes = value;
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
     *         &lt;element ref="{}filterable_reported_peptide_annotation_types" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_reported_peptide_annotation_types" minOccurs="0"/>
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
        "filterableReportedPeptideAnnotationTypes",
        "descriptiveReportedPeptideAnnotationTypes"
    })
    public static class ReportedPeptideAnnotationTypes {

        @XmlElement(name = "filterable_reported_peptide_annotation_types")
        protected FilterableReportedPeptideAnnotationTypes filterableReportedPeptideAnnotationTypes;
        @XmlElement(name = "descriptive_reported_peptide_annotation_types")
        protected DescriptiveReportedPeptideAnnotationTypes descriptiveReportedPeptideAnnotationTypes;

        /**
         * Gets the value of the filterableReportedPeptideAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link FilterableReportedPeptideAnnotationTypes }
         *     
         */
        public FilterableReportedPeptideAnnotationTypes getFilterableReportedPeptideAnnotationTypes() {
            return filterableReportedPeptideAnnotationTypes;
        }

        /**
         * Sets the value of the filterableReportedPeptideAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterableReportedPeptideAnnotationTypes }
         *     
         */
        public void setFilterableReportedPeptideAnnotationTypes(FilterableReportedPeptideAnnotationTypes value) {
            this.filterableReportedPeptideAnnotationTypes = value;
        }

        /**
         * Gets the value of the descriptiveReportedPeptideAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptiveReportedPeptideAnnotationTypes }
         *     
         */
        public DescriptiveReportedPeptideAnnotationTypes getDescriptiveReportedPeptideAnnotationTypes() {
            return descriptiveReportedPeptideAnnotationTypes;
        }

        /**
         * Sets the value of the descriptiveReportedPeptideAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptiveReportedPeptideAnnotationTypes }
         *     
         */
        public void setDescriptiveReportedPeptideAnnotationTypes(DescriptiveReportedPeptideAnnotationTypes value) {
            this.descriptiveReportedPeptideAnnotationTypes = value;
        }

    }

}
