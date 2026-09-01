import { useState } from "react";

function Sample(){
    // let count=0;

   const[count, setCount]= useState(0);
  const[name, setName]=useState("");

  //count --> current value / state variable
  //setCount --> update the state 
  //UseSTate(1) --> returns an array of 2 values  -- setCount , count
//useState("")


    // const handleClick=()=>{
    //     // count++;
    //     setCount(count+1);
    //     console.log(count);
    // }
    // const handleInput=(e)=>{
    //     console.log(e.target.value);
    //     setName(e.target.value);
    // }
    return(

        <>
            <h2>count: {count}</h2>
            <button onClick={()=>setCount(count+1)}>increment</button>
               
            <button onClick={()=>setCount(count-1)}>decrement</button>

            <h4>NAme: {name}</h4>
            <input type="text" placeholder="enter name" onChange={(e)=>setName(e.target.value)}/>
        </>
    );
}
export default Sample;