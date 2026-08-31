import Login from "./Login";
import Logout from "./Logout";

function Main({isUsernameValid}){

    // if(isUsernameValid)
    // {
    //     return <Login/>
    // }
    // else{
    //   return  <Logout/>
    // }

    
    
    return isUsernameValid? <Login/> : <Logout/>

    //React router -- library -- used to navigate between diff pages
    //react-router-dom --package 
}
export default Main;
