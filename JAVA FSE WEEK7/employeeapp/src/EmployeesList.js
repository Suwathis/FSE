import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeesList() {
  const employees = [
    { id: 1, name: "Siva", role: "Developer" },
    { id: 2, name: "Meena", role: "Tester" },
  ];

  return (
    <div>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeesList;
