//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.28 à 06:43:47 PM CET 
//


package bg.cv.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="adresse">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
 *         &lt;element name="formations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="diplome" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                             &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="skills">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skill" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *                             &lt;element name="experienceTitre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="typeDeContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lieuGeographique">
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
 *                             &lt;element name="entreprise">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "formations",
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
    protected Cv.Formations formations;
    @XmlElement(required = true)
    protected Cv.Languages languages;
    @XmlElement(required = true)
    protected Cv.Skills skills;
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
     * Obtient la valeur de la propriété formations.
     * 
     * @return
     *     possible object is
     *     {@link Cv.Formations }
     *     
     */
    public Cv.Formations getFormations() {
        return formations;
    }

    /**
     * Définit la valeur de la propriété formations.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.Formations }
     *     
     */
    public void setFormations(Cv.Formations value) {
        this.formations = value;
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
     * Obtient la valeur de la propriété skills.
     * 
     * @return
     *     possible object is
     *     {@link Cv.Skills }
     *     
     */
    public Cv.Skills getSkills() {
        return skills;
    }

    /**
     * Définit la valeur de la propriété skills.
     * 
     * @param value
     *     allowed object is
     *     {@link Cv.Skills }
     *     
     */
    public void setSkills(Cv.Skills value) {
        this.skills = value;
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
     *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="adresse">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "nom",
        "prenom",
        "telephone",
        "email",
        "adresse"
    })
    public static class EtatCivil {

        @XmlElement(required = true)
        protected String nom;
        @XmlElement(required = true)
        protected String prenom;
        @XmlElement(required = true)
        protected String telephone;
        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected Cv.EtatCivil.Adresse adresse;

        /**
         * Obtient la valeur de la propriété nom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNom() {
            return nom;
        }

        /**
         * Définit la valeur de la propriété nom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Obtient la valeur de la propriété prenom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrenom() {
            return prenom;
        }

        /**
         * Définit la valeur de la propriété prenom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrenom(String value) {
            this.prenom = value;
        }

        /**
         * Obtient la valeur de la propriété telephone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephone() {
            return telephone;
        }

        /**
         * Définit la valeur de la propriété telephone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephone(String value) {
            this.telephone = value;
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
         * Obtient la valeur de la propriété adresse.
         * 
         * @return
         *     possible object is
         *     {@link Cv.EtatCivil.Adresse }
         *     
         */
        public Cv.EtatCivil.Adresse getAdresse() {
            return adresse;
        }

        /**
         * Définit la valeur de la propriété adresse.
         * 
         * @param value
         *     allowed object is
         *     {@link Cv.EtatCivil.Adresse }
         *     
         */
        public void setAdresse(Cv.EtatCivil.Adresse value) {
            this.adresse = value;
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
         *         &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        public static class Adresse {

            @XmlElement(required = true)
            protected String ligne1;
            @XmlElement(required = true)
            protected Object ligne2;
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
             *     {@link Object }
             *     
             */
            public Object getLigne2() {
                return ligne2;
            }

            /**
             * Définit la valeur de la propriété ligne2.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setLigne2(Object value) {
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
     *                   &lt;element name="experienceTitre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="typeDeContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lieuGeographique">
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
     *                   &lt;element name="entreprise">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="experienceTitre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="typeDeContrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lieuGeographique">
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
         *         &lt;element name="entreprise">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected String experienceTitre;
            @XmlElement(required = true)
            protected String dateStart;
            @XmlElement(required = true)
            protected String dateEnd;
            @XmlElement(required = true, nillable = true)
            protected String typeDeContrat;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.LieuGeographique lieuGeographique;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.Entreprise entreprise;
            @XmlElement(required = true)
            protected String context;
            @XmlElement(required = true)
            protected String myGoal;
            @XmlElement(required = true)
            protected Cv.Experiences.Experience.Tasks tasks;
            @XmlElement(required = true)
            protected String technos;

            /**
             * Obtient la valeur de la propriété experienceTitre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExperienceTitre() {
                return experienceTitre;
            }

            /**
             * Définit la valeur de la propriété experienceTitre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExperienceTitre(String value) {
                this.experienceTitre = value;
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
             * Obtient la valeur de la propriété typeDeContrat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeDeContrat() {
                return typeDeContrat;
            }

            /**
             * Définit la valeur de la propriété typeDeContrat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeDeContrat(String value) {
                this.typeDeContrat = value;
            }

            /**
             * Obtient la valeur de la propriété lieuGeographique.
             * 
             * @return
             *     possible object is
             *     {@link Cv.Experiences.Experience.LieuGeographique }
             *     
             */
            public Cv.Experiences.Experience.LieuGeographique getLieuGeographique() {
                return lieuGeographique;
            }

            /**
             * Définit la valeur de la propriété lieuGeographique.
             * 
             * @param value
             *     allowed object is
             *     {@link Cv.Experiences.Experience.LieuGeographique }
             *     
             */
            public void setLieuGeographique(Cv.Experiences.Experience.LieuGeographique value) {
                this.lieuGeographique = value;
            }

            /**
             * Obtient la valeur de la propriété entreprise.
             * 
             * @return
             *     possible object is
             *     {@link Cv.Experiences.Experience.Entreprise }
             *     
             */
            public Cv.Experiences.Experience.Entreprise getEntreprise() {
                return entreprise;
            }

            /**
             * Définit la valeur de la propriété entreprise.
             * 
             * @param value
             *     allowed object is
             *     {@link Cv.Experiences.Experience.Entreprise }
             *     
             */
            public void setEntreprise(Cv.Experiences.Experience.Entreprise value) {
                this.entreprise = value;
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
             *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "nom",
                "info"
            })
            public static class Entreprise {

                @XmlElement(required = true)
                protected String nom;
                @XmlElement(required = true)
                protected String info;

                /**
                 * Obtient la valeur de la propriété nom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNom() {
                    return nom;
                }

                /**
                 * Définit la valeur de la propriété nom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNom(String value) {
                    this.nom = value;
                }

                /**
                 * Obtient la valeur de la propriété info.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInfo() {
                    return info;
                }

                /**
                 * Définit la valeur de la propriété info.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInfo(String value) {
                    this.info = value;
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
            public static class LieuGeographique {

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
     *         &lt;element name="formation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="diplome" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "formation"
    })
    public static class Formations {

        @XmlElement(required = true)
        protected List<Cv.Formations.Formation> formation;

        /**
         * Gets the value of the formation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Cv.Formations.Formation }
         * 
         * 
         */
        public List<Cv.Formations.Formation> getFormation() {
            if (formation == null) {
                formation = new ArrayList<Cv.Formations.Formation>();
            }
            return this.formation;
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
         *         &lt;element name="diplome" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "diplome",
            "school",
            "year"
        })
        public static class Formation {

            @XmlElement(required = true)
            protected String diplome;
            @XmlElement(required = true)
            protected String school;
            protected int year;

            /**
             * Obtient la valeur de la propriété diplome.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiplome() {
                return diplome;
            }

            /**
             * Définit la valeur de la propriété diplome.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiplome(String value) {
                this.diplome = value;
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
     *         &lt;element name="language" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
         *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            protected int level;

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
             */
            public int getLevel() {
                return level;
            }

            /**
             * Définit la valeur de la propriété level.
             * 
             */
            public void setLevel(int value) {
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
     *         &lt;element name="skill" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "skill"
    })
    public static class Skills {

        @XmlElement(required = true)
        protected List<Cv.Skills.Skill> skill;

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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "label",
            "nivel"
        })
        public static class Skill {

            @XmlElement(required = true)
            protected String label;
            protected int nivel;

            /**
             * Obtient la valeur de la propriété label.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * Définit la valeur de la propriété label.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Obtient la valeur de la propriété nivel.
             * 
             */
            public int getNivel() {
                return nivel;
            }

            /**
             * Définit la valeur de la propriété nivel.
             * 
             */
            public void setNivel(int value) {
                this.nivel = value;
            }

        }

    }

}
