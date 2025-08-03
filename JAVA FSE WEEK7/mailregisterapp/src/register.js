import React, { useState } from "react";

function Register() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    password: "",
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const validate = () => {
    const newErrors = {};

    if (form.name.length < 5) {
      newErrors.name = "Name must have at least 5 characters";
    }

    if (!form.email.includes("@") || !form.email.includes(".")) {
      newErrors.email = "Email must include '@' and '.'";
    }

    if (form.password.length < 8) {
      newErrors.password = "Password must have at least 8 characters";
    }

    return newErrors;
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const validationErrors = validate();
    setErrors(validationErrors);

    if (Object.keys(validationErrors).length === 0) {
      alert("Registration Successful!");
      console.log("Registered Info:", form);
      // Clear form
      setForm({ name: "", email: "", password: "" });
    }
  };

  return (
    <form onSubmit={handleSubmit} style={{ padding: "20px", maxWidth: "400px" }}>
      <h2>Register</h2>

      <div>
        <label>Name:</label><br />
        <input
          type="text"
          name="name"
          value={form.name}
          onChange={handleChange}
        />
        {errors.name && <div style={{ color: "red" }}>{errors.name}</div>}
      </div>

      <div>
        <label>Email:</label><br />
        <input
          type="text"
          name="email"
          value={form.email}
          onChange={handleChange}
        />
        {errors.email && <div style={{ color: "red" }}>{errors.email}</div>}
      </div>

      <div>
        <label>Password:</label><br />
        <input
          type="password"
          name="password"
          value={form.password}
          onChange={handleChange}
        />
        {errors.password && <div style={{ color: "red" }}>{errors.password}</div>}
      </div>

      <br />
      <button type="submit">Submit</button>
    </form>
  );
}

export default Register;
