// src/OnlineShopping.js
import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);
    // Step 2: Create an array of 5 Cart items
    this.state = {
      items: [
        { itemname: "Laptop", price: 60000 },
        { itemname: "Smartphone", price: 25000 },
        { itemname: "Headphones", price: 2000 },
        { itemname: "Shoes", price: 3000 },
        { itemname: "Watch", price: 1500 }
      ]
    };
  }

  render() {
    return (
      <div>
        <h1>🛒 Welcome to Online Shopping</h1>
        {/* Step 3: Loop and display */}
        {this.state.items.map((item, index) => (
          <Cart key={index} itemname={item.itemname} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
