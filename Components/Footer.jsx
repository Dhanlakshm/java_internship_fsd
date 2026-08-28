import { Component } from "react";

class Footer extends Component
{
    render(){
        return(
            <>
            <h3>from Footer comp </h3>
            <h4>{this.props.see}</h4>
            </>
        );
    };
}
export default Footer;