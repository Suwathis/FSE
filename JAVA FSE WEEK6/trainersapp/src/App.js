import './App.css';
import { Routes, Route, Link } from "react-router-dom";
import Home from "./Home";
import TrainersList from "./TrainerList";
import TrainerDetail from "./TrainerDetails";
import Trainers from "./TrainersMock";

function App() {
  return (
    <>
      <nav>
        <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainersList trainers={Trainers} />} />
        <Route path="/trainers/:id" element={<TrainerDetail />} />
      </Routes>
    </>
  );
}

export default App;

