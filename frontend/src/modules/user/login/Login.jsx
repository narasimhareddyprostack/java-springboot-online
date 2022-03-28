import React, { useState } from 'react'
let Login = () => {
    let [user, setUser] = useState({ email: "", password: "" })
    let updateHandler = (event) => {

        setUser({ ...user, [event.target.name]: event.target.value })
    }
    let submitHandler = (event) => {
        event.preventDefault();
        console.log(user);

    }
    return <div className="container mt-5">
        <div className="row">
            <div className="col-md-6">
                <div className="card">
                    <div className="card-header">
                        <h3>Login Form</h3>
                    </div>
                    <div className="card-body">
                        <form onSubmit={submitHandler}>
                            <div className="form-group">
                                <input className="form-control" placeholder="Email" name="email" type="email" onChange={updateHandler} />
                            </div>
                            <div className="form-group">
                                <input className="form-control" placeholder="Password" name="password" type="password" onChange={updateHandler} />
                            </div>
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
export default Login