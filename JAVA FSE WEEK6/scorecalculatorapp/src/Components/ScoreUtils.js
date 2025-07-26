// src/components/ScoreUtils.js
const percentToDecimal = (decimal) => {
  return (decimal * 100).toFixed(2) + "%";
};

const calcScore = (total, goal) => {
  return percentToDecimal(total / goal);
};

export { calcScore };
