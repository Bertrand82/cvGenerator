import React, { Component } from 'react';

import Pdf from "react-to-pdf";
import Cv from "./Cv";

const ref = React.createRef();
class BgCvPdf extends Component {
    constructor(props) {
        super(props)
        this.state = {
            cvXml: this.props.cvXml
        }
        console.log("BgCvPdf cvXml ", this.state.cvXml);
    }

   



    render() {
        if (this.props.cvXml) {
            return this.renderCV();
        } else {
            return (<div>No Data!</div>);
        }
    }
    renderCV() {
        return (

            <div>
                <Pdf targetRef={ref} filename="code-example.pdf">
                    {({ toPdf }) => <button onClick={toPdf}>Generate Pdf</button>}
                </Pdf>
                <div ref={ref}>

                    <Cv xml={this.props.cvXml} />
                </div>
            </div>
        );
    }
}

export default BgCvPdf;