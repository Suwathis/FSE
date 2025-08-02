import logo from './logo.svg';


import React from 'react';
import './App.css';

function App() {
  // Heading Element
  const heading = <h1>Office Space Rental App</h1>;

  // List of Office Objects
  const officeSpaces = [
    {
      name: 'Regus - Chennai Nungambakkam',
      rent: 55000,
      address: 'Nungambakkam, Chennai',
      image: "proimg1.jpeg"
    },
    {
      name: 'WeWork - Bangalore Koramangala',
      rent: 70000,
      address: 'Koramangala, Bangalore',
      image: "proimg2.jpeg"
    },
    {
      name: 'Innov8 - Mumbai Andheri',
      rent: 60000,
      address: 'Andheri East, Mumbai',
      image: "proimg3.jpeg"
    }
  ];

  // JSX Render
  return (
    <div className="App">
      {heading}
      <div className="office-list">
        {officeSpaces.map((office, index) => (
          <div key={index} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p className={office.rent > 60000 ? 'rent-green' : 'rent-red'}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
