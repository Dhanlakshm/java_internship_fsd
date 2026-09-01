import { useState } from "react";

import axios from "axios";

function Demo(){

    //url: https://fakestoreapi.com/products
    //fetch*(url) --> Promise object ---> convert tit to json --> data-> map()

    const[data, setData]=useState([]);

     function fetData(){
        fetch("https://jsonplaceholder.typicode.com/todos/")
        .then(res=>res.json())
        .then(result=>setData(result))
 

        // const res=axios.get("https://jsonplaceholder.typicode.com/todos/1")
        // const result=res.json()
        // setData(result);
        
    }


    return(
        <>
        <button onClick={fetData}>Display data</button>
        {
            data.map((item)=>{
                return(
                    <div key={item.userId}>
                        <h3>{item.title}</h3>                   
                    </div>
                );
            })
        }
        
        </>
    );
}
export default Demo;