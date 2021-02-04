import React, { Component } from 'react';
import './App.css';

import BgCvPdf from "./BgCvPdf";

const cv1 ='<cv xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="src/main/ressources/xsd/cv.xsd"> <title>Expert Java et J2EE</title>	<etatCivil>	<name>Guiral</name>	<first-name>Bertrand</first-name><date-of-birth>26/08/1958 </date-of-birth><photo-path>images/bertrand.jpg</photo-path><telephon>0682426361</telephon>	<email>bertrand.guiral@gmail.com</email><address><ligne1>2 rue Cariben</ligne1>	<ligne2></ligne2><city>Montpezat de Quercy</city><zipCode>82270</zipCode><country>France</country></address></etatCivil></cv>';
class BgCvGenerator extends Component {
    constructor(props) {
        super(props);
        this.state = {
            cvXmlTxt: cv1, 
            cvExemple: "cvExemple111" , 
        };
        this.handleChange = this.handleChange.bind(this);
      //  this.fetchCvExemple = this.fetchCvExemple.bind(this);
      //  this.fetchCvExemple();
        
    }
   
    fetchCvExemple =  () => { 

        fetch('/cv_bg.xml')
            .then((r) => r.text())
            .then(text => {
                this.setState( {cvXmlTxt :text});   
                console.log("fetch EXempleAAAAAAAAAAAA", this.state.cvXmlTxt.length  );        
            })
        console.log("fetch EXemple BBBBBBB", this.state.cvXmlTxt.length);
    }
    processTextarea(event){
        var text = document.getElementById('textareaId').innerHTML
        console.log("processTextarea", text);
    }
  
    handleChange(event) {
        console.log("handleChange", event.target.value.length);
        try {
            this.setState({ cvXmlTxt: event.target.value });
            var XMLParser = require('react-xml-parser');
            var xml = new XMLParser().parseFromString(event.target.value);    // Assume xmlText contains the example XML
            this.setState({ cvXml: xml });
         } catch (e) {
            console.log("Exception", e)
        }
    }

    render() {
        return (
            <div>
                <label>past cv  : </label>
                <textarea id="textareaId" className="textarea"
                    rows="10"
                    cols="30"
                    onChange={this.handleChange} 
                    value={this.state.cvXmlTxt}
                > 
                    </textarea>
                    <button onClick={this.fetchCvExemple} >Exemple</button>
                    <button onClick={this.processTextarea} >Process</button>
                <BgCvPdf cvXml={this.state.cvXml}  />
               
            </div>
        );
    }



}
export default BgCvGenerator;