import logo from './logo.svg';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';


import React, { useState } from 'react';

function App() {
  const [count, setCount] = useState(0); // useState hook for count

  function IncreMethod() {
    setCount(count + 1);
  }
  function DecreMethod() {
    setCount(count - 1);
  }
  function welfunc(){
    alert("welcome");
  }
  function clickfunc(){
    alert("I was clicked");
  }


  return (
    <div>
      <h2>{count}</h2>
      <h1 style={{color:'green'}}>Currency Convertor!!!</h1>
      <button onClick={IncreMethod}>Increment</button><br></br>
      <button onClick={DecreMethod}>Decrement</button><br></br>
      <button onClick={welfunc}>Say Welcome</button><br></br>
      <button onClick={clickfunc}>Click on me</button><br></br>
      <CurrencyConvertor/>
      
    </div>
    
    
  );
}
export default App;
