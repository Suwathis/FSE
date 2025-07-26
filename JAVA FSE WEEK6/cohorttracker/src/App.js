import logo from './logo.svg';
import './App.css';

// src/App.js
import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      name: "Java Cohort 1",
      status: "ongoing",
      startDate: "2025-06-01",
      endDate: "2025-08-31",
    },
    {
      name: "Python Cohort A",
      status: "completed",
      startDate: "2025-01-10",
      endDate: "2025-03-20",
    },
  ];

  return (
    <div>
      <h1>Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;

