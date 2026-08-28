//functional comp ---> js function return JSX(JAvaScript XML -->allows us to add html inside JS)
//Class comp --> Js class that extends REact.Component (has a render() ---> that will return your jSX)

function Header(props){
    return(
        <>
        <h3>Header component</h3>
        <h3>Name:  {props.name}</h3>
        <h3>Age:  {props.age}</h3>
        <h3>Login status: {props.isLoggedIN?"LOgged iN":"invalid"}</h3>
        
        </>
    );
}
export default Header;

//props --> properties 
//