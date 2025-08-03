import logo from './logo.svg';
import './App.css';

import React, { useState } from "react";
import EmployeesList from "./EmployeesList";
import ThemeContext from "./ThemeContext";

function App() {
  const [theme, setTheme] = useState('light');

  const toggleTheme = () => {
    setTheme((prev) => (prev === 'light' ? 'dark' : 'light'));
  };

  return (
    <ThemeContext.Provider value={theme}>
      <div style={{ padding: "20px" }}>
        <h2>Current Theme: {theme}</h2>
        <button onClick={toggleTheme}>Toggle Theme</button>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
