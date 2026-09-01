import { useState } from "react";

function Sample(){

    const[data, setData]= useState([]);

    function fetchData(){

    fetch("https://fakestoreapi.com/products")
    .then(res=>res.json())
    .then(data=>setData(data))
    }

    return(
        <>
        <button onClick={fetchData}>get Data</button> 
      
      {
        data.map((item)=>{
            return(
            <div key={item.id}>
                <h2>{item.title}</h2>
                <h2>{item.price}</h2>
             </div>
            );
        })
      }
        </>
    );
}
export default Sample;