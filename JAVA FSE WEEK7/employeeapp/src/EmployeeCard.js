import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  return (
    <div style={{ marginBottom: "20px" }}>
      <h3>{employee.name}</h3>
      <p>{employee.role}</p>
      <button className={theme}>Action</button>
    </div>
  );
}

export default EmployeeCard;
