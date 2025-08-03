import React, { Component } from "react";

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();
      const userData = data.results[0];
      this.setState({ user: userData });
    } catch (error) {
      console.error("Error fetching user:", error);
    }
  }

  render() {
    const { user } = this.state;

    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        {user ? (
          <div>
            <h1>
              {user.name.title} {user.name.first} {user.name.last}
            </h1>
            <img
              src={user.picture.medium}
              alt="User"
              style={{ borderRadius: "10px" }}
            />
          </div>
        ) : (
          <h2>Loading user data...</h2>
        )}
      </div>
    );
  }
}

export default Getuser;
