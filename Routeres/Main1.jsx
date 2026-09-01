
import {BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
function Main1(){
    return(

        // Home === /home
        // About == /about
        // Conatct ==/conatct
        <>
        <BrowserRouter>

        <Link to="/">Home</Link>
         <Link to="/about">About</Link>
          <Link to="/contact">Contact</Link>

        <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/about" element={<About/>}/>
            <Route path="/contact" element={<Contact/>}/>
        </Routes>

        </BrowserRouter>

        </>
    );


}
export default Main1;