import React, { useState } from "react";

function ComplaintRegister() {
  const [name, setName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevents page reload

    const refNo = "REF" + Math.floor(100000 + Math.random() * 900000); // 6-digit ref number

    alert(`Thanks ${name}`);
    alert(`Your complaint was received: "${complaint}"`);
    alert(`Your Reference Number is: ${refNo}`);

    // Reset form
    setName("");
    setComplaint("");
  };

  return (
    <form onSubmit={handleSubmit} style={{ padding: "20px" }}>
      <h2>Complaint Registration</h2>
      <div>
        <label>
          Name:{" "}
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
            required
          />
        </label>
      </div>
      <br />
      <div>
        <label>
          Complaint:{" "}
          <textarea
            rows="4"
            cols="30"
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            required
          />
        </label>
      </div>
      <br />
      <button type="submit">Submit</button>
    </form>
  );
}

export default ComplaintRegister;
