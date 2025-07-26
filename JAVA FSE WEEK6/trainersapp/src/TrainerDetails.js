// src/TrainerDetails.js
import { useParams } from "react-router-dom";
import Trainers from "./TrainersMock";

function TrainerDetail() {
  const { id } = useParams();
  const trainer = Trainers.find(t => t.TrainerId === id);

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div>
      <h2>{trainer.Name}'s Details</h2>
      <p>Email: {trainer.Email}</p>
      <p>Phone: {trainer.Phone}</p>
      <p>Technology: {trainer.Technology}</p>
      <p>Skills: {trainer.Skills.join(", ")}</p>
    </div>
  );
}

export default TrainerDetail;
