// src/components/CalculateScore.js
import React from "react";
import "../Stylesheets/mystyle.css";
import { calcScore } from "./ScoreUtils";

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="formatstyle">
    <h1 style={{ color: "brown" }}>Student Details:</h1>

    <div className="Name">
      <b>Name:</b> <span>{Name}</span>
    </div>

    <div className="School">
      <b>School:</b> <span>{School}</span>
    </div>

    <div className="Total">
      <b>Total:</b> <span>{total}</span> Marks
    </div>

    <div className="Score">
      <b>Score:</b> <span>{calcScore(total, goal)}</span>
    </div>
  </div>
);
