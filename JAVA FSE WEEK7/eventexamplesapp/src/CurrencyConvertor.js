import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');
  const [converted, setConverted] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    let result = 0;

    if (currency === 'Euro') {
      result = amount * 80; // Example rate: 1 Euro = 80 INR
    } else if (currency === 'USD') {
      result = amount * 74;
    }

    setConverted(result);
    // alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      
      <form onSubmit={handleSubmit}>
        <div>
          <label>Amount:</label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            required
            style={{ margin: '5px' }}
          />
        </div>

        <div>
          <label>Currency:</label>
          <select
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{ margin: '5px' }}
          >
            <option value="Euro">Euro</option>
            <option value="USD">USD</option>
          </select>
        </div>

        <button type="submit">Submit</button>
      </form>

      {converted !== null && (
        <p style={{ marginTop: '20px', fontWeight: 'bold' }}>
          Converted Amount: ₹{converted}
        </p>
      )}
    </div>
  );
}

export default CurrencyConvertor;

