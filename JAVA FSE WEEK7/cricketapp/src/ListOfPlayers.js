// src/ListOfPlayers.js
import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 45 },
    { name: 'Rahul', score: 75 },
    { name: 'Shreyas', score: 60 },
    { name: 'Jadeja', score: 95 },
    { name: 'Pant', score: 66 },
    { name: 'Ashwin', score: 80 },
    { name: 'Bumrah', score: 35 },
    { name: 'Shami', score: 40 },
    { name: 'Surya', score: 77 },
    { name: 'Hardik', score: 88 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>
            {p.name} - {p.score}
          </li>
        ))}
      </ul>

      <h2>Players with Score &lt; 70</h2>
      <ul>
        {lowScorers.map((p, index) => (
          <li key={index}>
            {p.name} - {p.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
