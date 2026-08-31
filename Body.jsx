import { Component } from "react";

class Body extends Component{
    render(){
        return(
            <>
            <h1>Class comp</h1>
            <h2>Name: {this.props.name}</h2>
            <h3>Age:  {this.props.age}</h3>
            <h3>Login status: {this.props.isLoggedIN?"LOgged iN":"invalid"}</h3>
            </>
        );
    };
}
export default Body;