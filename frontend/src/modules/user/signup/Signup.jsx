import React, { useState } from 'react'
import { Link } from 'react-router-dom'
let Signup = () => {
    let [user, setUser] = useState({ name: "", email: "", password: "" })
    let updateHandler = (event) => {
        setUser({ ...user, [event.target.name]: event.target.value })
    }
    let submitHandler = (event) => {
        event.preventDefault();
        console.log(user);

    }
    return <div className="container mt-5">
        <div className="row">
            <div className="col-md-4">
                <div className="card">
                    <div className="card-header">
                        <h3>Registration Form</h3>
                    </div>
                    <div className="card-body">
                        <form onSubmit={submitHandler}>
                            <div className="form-group">
                                <input className="form-control" placeholder="User Name" name="name" type="text" onChange={updateHandler} />
                            </div>
                            <div className="form-group">
                                <input className="form-control" placeholder="Email" name="email" type="email" onChange={updateHandler} />
                            </div>
                            <div className="form-group">
                                <input className="form-control" placeholder="Password" name="password" type="password" onChange={updateHandler} />
                            </div>
                            <Link to="/login">have Account ? Login </Link>
                            <div className="form-group">
                                <input className="btn btn-success" type="submit" />
                            </div>


                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
}
export default Signup