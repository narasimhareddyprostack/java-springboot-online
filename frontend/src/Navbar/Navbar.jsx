import React from 'react'
import { Link } from 'react-router-dom'
const Navbar = () => {
    return (
        <nav className="navbar navbar-dark bg-dark navbar-expand-lg">
            <Link to="/home" className="navbar-brand"> Ecom Application</Link>

            <div className="mr-auto">
                <ul className="navbar-nav">
                    <li className="nav-list"><Link to="/login" className="nav-link">User</Link></li>
                    <li className="nav-list"><Link to="/signup" className="nav-link">Registration</Link></li>
                </ul>
            </div>
        </nav>
    )
}

export default Navbar
