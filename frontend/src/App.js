import React from 'react'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Navbar from './Navbar/Navbar'
import Login from './modules/user/login/Login'
const App = () => {
  return (
    <div>
      <Router>
        <Navbar />
        <Routes>
          <Route path="/user" element={<Login />} />
        </Routes>
      </Router>
    </div>
  )
}

export default App
