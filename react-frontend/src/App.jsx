import './App.css';
import Employee from './components/Employee';
import Product from './components/Product';

function App() {
  return (
    <div className="App">
        <div style={{padding: '10px'}}>
          <Product/>
        </div>
        <div style={{padding: '10px'}}>
          <Employee/>
        </div>
    </div>
  );
}
export default App;
