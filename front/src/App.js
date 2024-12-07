import logo from './logo.svg';
import './App.css';
import SignIn from './sign-in/SignIn';
import SignUp from './sign-up/SignUp';
import MarketingPage from './marketing-page/MarketingPage';

function App() {
  return (
    <div className="App">
      <SignUp />
      {/* <SignIn /> */}
      {/* <MarketingPage /> */}
    </div>
  );
}

export default App;