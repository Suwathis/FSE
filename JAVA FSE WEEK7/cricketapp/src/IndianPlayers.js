// src/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Rahul', 'Jadeja', 'Pant', 'Ashwin'];

  const oddTeam = allPlayers.filter((_, index) => index % 2 !== 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 === 0);

  // Destructuring example
  const [captain, viceCaptain, ...others] = allPlayers;

  const T20players = ['Surya', 'Hardik'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane'];

  // Merging arrays
  const allIndianPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team</h2>
      <ul>
        {oddTeam.map((p, index) => (
          <li key={index}>{p}</li>
        ))}
      </ul>

      <h2>Even Team</h2>
      <ul>
        {evenTeam.map((p, index) => (
          <li key={index}>{p}</li>
        ))}
      </ul>

      <h3>Destructured:</h3>
      <p>Captain: {captain}</p>
      <p>Vice Captain: {viceCaptain}</p>
      <p>Other Players: {others.join(', ')}</p>

      <h2>Merged Player List</h2>
      <ul>
        {allIndianPlayers.map((p, index) => (
          <li key={index}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
