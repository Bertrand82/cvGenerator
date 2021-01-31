//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.31 à 07:08:30 PM CET 
//


package bg.cv.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="etatCivil">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="first-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date-of-birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photo-path" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="telephon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="address">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="educations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="education" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="languages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="skills" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skillLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="skill" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="nivel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="experiences">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="experience" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="experienceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="typeOfContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="company">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="companyInfos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="myGoal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tasks">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded">
 *                                       &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="technos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "title",
    "etatCivil",
    "educations",
    "languages",
    "skills",
    "experiences"
})
@XmlRootElement(name = "cv")
public class Cv {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected Cv.EtatCivil etatCivil;
    @XmlElement(required = true)
    protected Cv.Educations educations;
    @XmlElement(required = true)
    protected Cv.Languages languages;
    @XmlElement(required = true)
    protected List<Cv.Skills> skills;
    @XmlElement(required = true)
    protected Cv.Experiences experiences;

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété etatCivil.
     * 
     * @return
     *     possible object is
     *     {@link Cv.EtatCivil }
     *     
     */
    public Cv.EtatCivil getEtatCivil() {
        return etatCivil;
    }

    /**
     * Définit la valeur de la propriété etatCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.EtatCivil }
     *     
     */
    public void setEtatCivil(Cv.EtatCivil value) {
        this.etatCivil = value;
    }

    /**
     * Obtient la valeur de la propriété educations.
     * 
     * @return
     *     possible object is
     *     {@link Cv.Educations }
     *     
     */
    public Cv.Educations getEducations() {
        return educations;
    }

    /**
     * Définit la valeur de la propriété educations.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.Educations }
     *     
     */
    public void setEducations(Cv.Educations value) {
        this.educations = value;
    }

    /**
     * Obtient la valeur de la propriété languages.
     * 
     * @return
     *     possible object is
     *     {@link Cv.Languages }
     *     
     */
    public Cv.Languages getLanguages() {
        return languages;
    }

    /**
     * Définit la valeur de la propriété languages.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.Languages }
     *     
     */
    public void setLanguages(Cv.Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkills().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cv.Skills }
     * 
     * 
     */
    public List<Cv.Skills> getSkills() {
        if (skills == null) {
            skills = new ArrayList<Cv.Skills>();
        }
        return this.skills;
    }

    /**
     * Obtient la valeur de la propriété experiences.
     * 
     * @return
     *     possible object is
     *     {@link Cv.Experiences }
     *     
     */
    public Cv.Experiences getExperiences() {
        return experiences;
    }

    /**
     * Définit la valeur de la propriété experiences.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.Experiences }
     *     
     */
    public void setExperiences(Cv.Experiences value) {
        this.experiences = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="education" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "education"
    })
    public static class Educations {

        @XmlElement(required = true)
        protected List<Cv.Educations.Education> education;

        /**
         * Gets the value of the education property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the education property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cv.Educations.Education }
         * 
         * 
         */
        public List<Cv.Educations.Education> getEducation() {
            if (education == null) {
                education = new ArrayList<Cv.Educations.Education>();
            }
            return this.education;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="diploma" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "diploma",
            "school",
            "year"
        })
        public static class Education {

            @XmlElement(required = true)
            protected String diploma;
            @XmlElement(required = true)
            protected String school;
            protected int year;

            /**
             * Obtient la valeur de la propriété diploma.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiploma() {
                return diploma;
            }

            /**
             * Définit la valeur de la propriété diploma.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiploma(String value) {
                this.diploma = value;
            }

            /**
             * Obtient la valeur de la propriété school.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchool() {
                return school;
            }

            /**
             * Définit la valeur de la propriété school.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchool(String value) {
                this.school = value;
            }

            /**
             * Obtient la valeur de la propriété year.
             * 
             */
            public int getYear() {
                return year;
            }

            /**
             * Définit la valeur de la propriété year.
             * 
             */
            public void setYear(int value) {
                this.year = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="first-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date-of-birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photo-path" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="telephon" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="address">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "firstName",
        "dateOfBirth",
        "photoPath",
        "telephon",
        "email",
        "address"
    })
    public static class EtatCivil {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(name = "first-name", required = true)
        protected String firstName;
        @XmlElement(name = "date-of-birth")
        protected String dateOfBirth;
        @XmlElement(name = "photo-path")
        protected Object photoPath;
        @XmlElement(required = true)
        protected String telephon;
        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected Cv.EtatCivil.Address address;

        /**
         * Obtient la valeur de la propriété name.
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
         * Définit la valeur de la propriété name.
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
         * Obtient la valeur de la propriété firstName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Définit la valeur de la propriété firstName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Obtient la valeur de la propriété dateOfBirth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Définit la valeur de la propriété dateOfBirth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(String value) {
            this.dateOfBirth = value;
        }

        /**
         * Obtient la valeur de la propriété photoPath.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPhotoPath() {
            return photoPath;
        }

        /**
         * Définit la valeur de la propriété photoPath.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPhotoPath(Object value) {
            this.photoPath = value;
        }

        /**
         * Obtient la valeur de la propriété telephon.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephon() {
            return telephon;
        }

        /**
         * Définit la valeur de la propriété telephon.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephon(String value) {
            this.telephon = value;
        }

        /**
         * Obtient la valeur de la propriété email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Définit la valeur de la propriété email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Obtient la valeur de la propriété address.
         * 
         * @return
         *     possible object is
         *     {@link Cv.EtatCivil.Address }
         *     
         */
        public Cv.EtatCivil.Address getAddress() {
            return address;
        }

        /**
         * Définit la valeur de la propriété address.
         * 
         * @param value
         *     allowed object is
         *     {@link Cv.EtatCivil.Address }
         *     
         */
        public void setAddress(Cv.EtatCivil.Address value) {
            this.address = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "ligne1",
            "ligne2",
            "city",
            "zipCode",
            "country"
        })
        public static class Address {

            @XmlElement(required = true)
            protected String ligne1;
            protected String ligne2;
            @XmlElement(required = true)
            protected String city;
            protected int zipCode;
            @XmlElement(required = true)
            protected String country;

            /**
             * Obtient la valeur de la propriété ligne1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLigne1() {
                return ligne1;
            }

            /**
             * Définit la valeur de la propriété ligne1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLigne1(String value) {
                this.ligne1 = value;
            }

            /**
             * Obtient la valeur de la propriété ligne2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLigne2() {
                return ligne2;
            }

            /**
             * Définit la valeur de la propriété ligne2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLigne2(String value) {
                this.ligne2 = value;
            }

            /**
             * Obtient la valeur de la propriété city.
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
             * Définit la valeur de la propriété city.
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
             * Obtient la valeur de la propriété zipCode.
             * 
             */
            public int getZipCode() {
                return zipCode;
            }

            /**
             * Définit la valeur de la propriété zipCode.
             * 
             */
            public void setZipCode(int value) {
                this.zipCode = value;
            }

            /**
             * Obtient la valeur de la propriété country.
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
             * Définit la valeur de la propriété country.
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

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="experience" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="experienceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="typeOfContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="location">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="company">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="companyInfos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="myGoal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tasks">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="technos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
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
        "experience"
    })
    public static class Experiences {

        @XmlElement(required = true)
        protected List<Cv.Experiences.Experience> experience;

        /**
         * Gets the value of the experience property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experience property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExperience().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cv.Experiences.Experience }
         * 
         * 
         */
        public List<Cv.Experiences.Experience> getExperience() {
            if (experience == null) {
                experience = new ArrayList<Cv.Experiences.Experience>();
            }
            return this.experience;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="experienceTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="typeOfContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="location">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="company">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="companyInfos" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="myGoal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tasks">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="technos" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Experience {

            @XmlElement(required = true)
            protected String experienceTitle;
            @XmlElement(required = true)
            protected String dateStart;
            @XmlElement(required = true)
            protected String dateEnd;
            @XmlElement(required = true, nillable = true)
            protected String typeOfContract;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.Location location;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.Company company;
            @XmlElement(required = true)
            protected String context;
            @XmlElement(required = true)
            protected String myGoal;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.Tasks tasks;
            @XmlElement(required = true)
            protected String technos;

            /**
             * Obtient la valeur de la propriété experienceTitle.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExperienceTitle() {
                return experienceTitle;
            }

            /**
             * Définit la valeur de la propriété experienceTitle.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExperienceTitle(String value) {
                this.experienceTitle = value;
            }

            /**
             * Obtient la valeur de la propriété dateStart.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateStart() {
                return dateStart;
            }

            /**
             * Définit la valeur de la propriété dateStart.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateStart(String value) {
                this.dateStart = value;
            }

            /**
             * Obtient la valeur de la propriété dateEnd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateEnd() {
                return dateEnd;
            }

            /**
             * Définit la valeur de la propriété dateEnd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateEnd(String value) {
                this.dateEnd = value;
            }

            /**
             * Obtient la valeur de la propriété typeOfContract.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeOfContract() {
                return typeOfContract;
            }

            /**
             * Définit la valeur de la propriété typeOfContract.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeOfContract(String value) {
                this.typeOfContract = value;
            }

            /**
             * Obtient la valeur de la propriété location.
             * 
             * @return
             *     possible object is
             *     {@link Cv.Experiences.Experience.Location }
             *     
             */
            public Cv.Experiences.Experience.Location getLocation() {
                return location;
            }

            /**
             * Définit la valeur de la propriété location.
             * 
             * @param value
             *     allowed object is
             *     {@link Cv.Experiences.Experience.Location }
             *     
             */
            public void setLocation(Cv.Experiences.Experience.Location value) {
                this.location = value;
            }

            /**
             * Obtient la valeur de la propriété company.
             * 
             * @return
             *     possible object is
             *     {@link Cv.Experiences.Experience.Company }
             *     
             */
            public Cv.Experiences.Experience.Company getCompany() {
                return company;
            }

            /**
             * Définit la valeur de la propriété company.
             * 
             * @param value
             *     allowed object is
             *     {@link Cv.Experiences.Experience.Company }
             *     
             */
            public void setCompany(Cv.Experiences.Experience.Company value) {
                this.company = value;
            }

            /**
             * Obtient la valeur de la propriété context.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContext() {
                return context;
            }

            /**
             * Définit la valeur de la propriété context.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContext(String value) {
                this.context = value;
            }

            /**
             * Obtient la valeur de la propriété myGoal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMyGoal() {
                return myGoal;
            }

            /**
             * Définit la valeur de la propriété myGoal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMyGoal(String value) {
                this.myGoal = value;
            }

            /**
             * Obtient la valeur de la propriété tasks.
             * 
             * @return
             *     possible object is
             *     {@link Cv.Experiences.Experience.Tasks }
             *     
             */
            public Cv.Experiences.Experience.Tasks getTasks() {
                return tasks;
            }

            /**
             * Définit la valeur de la propriété tasks.
             * 
             * @param value
             *     allowed object is
             *     {@link Cv.Experiences.Experience.Tasks }
             *     
             */
            public void setTasks(Cv.Experiences.Experience.Tasks value) {
                this.tasks = value;
            }

            /**
             * Obtient la valeur de la propriété technos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTechnos() {
                return technos;
            }

            /**
             * Définit la valeur de la propriété technos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTechnos(String value) {
                this.technos = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="companyInfos" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "companyName",
                "companyInfos"
            })
            public static class Company {

                @XmlElement(required = true)
                protected String companyName;
                @XmlElement(required = true)
                protected String companyInfos;

                /**
                 * Obtient la valeur de la propriété companyName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyName() {
                    return companyName;
                }

                /**
                 * Définit la valeur de la propriété companyName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyName(String value) {
                    this.companyName = value;
                }

                /**
                 * Obtient la valeur de la propriété companyInfos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyInfos() {
                    return companyInfos;
                }

                /**
                 * Définit la valeur de la propriété companyInfos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyInfos(String value) {
                    this.companyInfos = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "city",
                "country"
            })
            public static class Location {

                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String country;

                /**
                 * Obtient la valeur de la propriété city.
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
                 * Définit la valeur de la propriété city.
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
                 * Obtient la valeur de la propriété country.
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
                 * Définit la valeur de la propriété country.
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
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "task"
            })
            public static class Tasks {

                @XmlElement(required = true)
                protected List<String> task;

                /**
                 * Gets the value of the task property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the task property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTask().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTask() {
                    if (task == null) {
                        task = new ArrayList<String>();
                    }
                    return this.task;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="language" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "language"
    })
    public static class Languages {

        @XmlElement(required = true)
        protected List<Cv.Languages.Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cv.Languages.Language }
         * 
         * 
         */
        public List<Cv.Languages.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<Cv.Languages.Language>();
            }
            return this.language;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "level"
        })
        public static class Language {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String level;

            /**
             * Obtient la valeur de la propriété name.
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
             * Définit la valeur de la propriété name.
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
             * Obtient la valeur de la propriété level.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLevel() {
                return level;
            }

            /**
             * Définit la valeur de la propriété level.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLevel(String value) {
                this.level = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="skillLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="skill" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="nivel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "skillLabel",
        "skill"
    })
    public static class Skills {

        @XmlElement(required = true)
        protected String skillLabel;
        @XmlElement(required = true)
        protected List<Cv.Skills.Skill> skill;

        /**
         * Obtient la valeur de la propriété skillLabel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkillLabel() {
            return skillLabel;
        }

        /**
         * Définit la valeur de la propriété skillLabel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkillLabel(String value) {
            this.skillLabel = value;
        }

        /**
         * Gets the value of the skill property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the skill property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSkill().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cv.Skills.Skill }
         * 
         * 
         */
        public List<Cv.Skills.Skill> getSkill() {
            if (skill == null) {
                skill = new ArrayList<Cv.Skills.Skill>();
            }
            return this.skill;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="nivel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Skill {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nivel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short nivel;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété nivel.
             * 
             */
            public short getNivel() {
                return nivel;
            }

            /**
             * Définit la valeur de la propriété nivel.
             * 
             */
            public void setNivel(short value) {
                this.nivel = value;
            }

        }

    }

}
