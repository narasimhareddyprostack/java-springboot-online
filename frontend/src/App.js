import React from 'react'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Login from './modules/user/login/Login'
import Signup from './modules/user/signup/Signup'
import { Provider } from 'react-redux'
import { store } from './redux/store';
const App = () => {
  return (
    <div>
      <Provider store={store}>
        <Router>
          <Navbar />
          <Routes>
            <Route path="/login" element={<Login />} />
            <Route path="/signup" element={<Signup />} />
          </Routes>
        </Router>
      </Provider>
    </div>
  )
}

export default App
