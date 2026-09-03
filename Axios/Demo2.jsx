import axios from "axios";

function Demo2(){

const product={
    id:101,
    title: 'test product',
    price: 14.5,
    description: 'test description',
    category: 'test category',
}
//localhost:8080/products/101

        axios.delete("https://fakestoreapi.com/products/101",product)
        .then((res)=>{
            console.log(res.data);
        })

    return(
        //npm list axois
      <>
      <h4>Post operation</h4>
      
      </>  
    );
}
export default Demo2;