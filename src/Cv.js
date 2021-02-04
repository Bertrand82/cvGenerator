import React, { Component } from 'react';
import './Cv.css';

/* intersperse: Return an array with the separator interspersed between
 * each element of the input array.
 *
 * > _([1,2,3]).intersperse(0)
 * [1,0,2,0,3]
 */
function intersperse(arr, sep) {
    if (arr.length === 0) {
        return [];
    }

    return arr.slice(1).reduce(function (xs, x, i) {
        return xs.concat([sep, x]);
    }, [arr[0]]);
}

class Cv extends Component {
    constructor(props) {
        super(props);
        this.title = this.props.xml.getElementsByTagName('title')[0].value;
        console.log("Cv2-------------constructor title :", this.title);
        console.log("Cv2-------------constructor ", this.props.xml.getElementsByTagName('etatCivil')[0]);
    }

    render() {
        const itemsSkill = [];
        const itemsExperiences = [];
        this.props.xml.getElementsByTagName('skills').forEach((element, index) => {
            console.log("skills index :", index);
            console.log("skills element :" + index + " :", element);
            console.log("skills element.value :" + index + " :", element.value);

            itemsSkill.push(<Skills id={index} xml={element} />);
        });
        this.props.xml.getElementsByTagName('experience').forEach((element, index) => {
            console.log("experiences index :", index);
            console.log("experiences element :", element);
            console.log("experiences element.value :", element.value);

            itemsExperiences.push(<Experience id={index} xml={element} />);
        });
        return (
            <div >
                <h2> {this.title}</h2>
                <EtatCivil xml={this.props.xml.getElementsByTagName('etatCivil')[0]} />
                <h3>Compétences</h3>
                {itemsSkill}
                <h3>Experiences</h3>
                {itemsExperiences}
            </div>
        )
    }
}

class EtatCivil extends Component {
    constructor(props) {
        super(props);
        this.name = this.props.xml.getElementsByTagName('name')[0].value;
        this.firstName = this.props.xml.getElementsByTagName('first-name')[0].value;
        this.dateOfBirth = this.props.xml.getElementsByTagName('date-of-birth')[0].value;
        this.photoPAth = this.props.xml.getElementsByTagName('photo-path')[0].value;
        this.telephone = this.props.xml.getElementsByTagName('telephon')[0].value;
        this.email = this.props.xml.getElementsByTagName('email')[0].value;
        console.log("xxxxxxxxxxx ", this.props.xml.getElementsByTagName('address')[0])
    }
    render() {
        return (
            <div className="cv">
                {this.firstName}  {this.name}
                <div>{this.telephone} </div>
                <div>{this.email} </div>
                <Address xml={this.props.xml.getElementsByTagName('address')[0]} />
            </div>
        )
    }
}

class Address extends Component {
    constructor(props) {
        super(props);
        this.ligne1 = this.props.xml.getElementsByTagName('ligne1')[0].value;
        this.ligne2 = this.props.xml.getElementsByTagName('ligne2')[0].value;
        this.city = this.props.xml.getElementsByTagName('city')[0].value;
        this.zipCode = this.props.xml.getElementsByTagName('zipCode')[0].value;
        this.country = this.props.xml.getElementsByTagName('country')[0].value;

    }
    render() {
        return (
            <div>
                <div>{this.ligne1}  </div>
                <div>{this.ligne2}  </div>
                <div>{this.zipCode}  {this.city} </div>
                <div>{this.country} </div>
            </div>
        )
    }
}

class Skills extends Component {
    render() {
        var items = [];
        this.props.xml.getElementsByTagName('skill').forEach((element, index) => {
            console.log("index :", index);
            console.log("element :", element);
            console.log("element.value :", element.value);

            items.push(<span key={index}> {element.value}</span>);
        });
        items = intersperse(items, ", ");
        items.push(".");
        return (
            <div className="cv">
                {this.props.xml.getElementsByTagName('skillLabel')[0].value} :
                {items}
            </div>
        )
    }
}
class Experience extends Component {
    constructor(props) {
        super(props);
        this.experienceTitle = this.props.xml.getElementsByTagName('experienceTitle')[0].value;
        this.dateStart = this.props.xml.getElementsByTagName('dateStart')[0].value;
        this.dateEnd = this.props.xml.getElementsByTagName('dateEnd')[0].value;
        this.companyName = this.props.xml.getElementsByTagName('companyName')[0].value;
        this.context1 = this.props.xml.getElementsByTagName('context')[0].value;
        this.myGoal = this.props.xml.getElementsByTagName('myGoal')[0].value;
        this.technos = this.props.xml.getElementsByTagName('technos')[0].value;
        
    }
    render() {
        return (
            <div className="cv">
                du {this.dateStart} au {this.dateEnd} - {this.companyName}  : {this.experienceTitle}
                <div> { this.context1}</div>
                <div> { this.myGoal}</div>
                <div>Technos: { this.technos}</div>
            </div>
        )
    }
}
export default Cv;