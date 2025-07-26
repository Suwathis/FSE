// src/CountPeople.js
import React, { Component } from "react";

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1,
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1,
    }));
  };

  render() {
    return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h2>🏢 Welcome to the Mall</h2>
        <p>🟢 People Entered: {this.state.entryCount}</p>
        <p>🔴 People Exited: {this.state.exitCount}</p>
        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit} style={{ marginLeft: "10px" }}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
