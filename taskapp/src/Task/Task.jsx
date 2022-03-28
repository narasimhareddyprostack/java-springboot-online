import React, { useState, useEffect } from 'react'
import Axios from 'axios';

const Task = () => {
    let [task, setTask] = useState([]);
    useEffect(() => {
        Axios.get('localhost:6565/todo/task')
            .then((resonpse) => {
                console.log(resonpse.data + "test case 123")
                setTask(resonpse.data);
            })
            .catch((err) => {
                console.log(err)
            })
    }, []);
    return (
        <div>
            <pre>{JSON.stringify(task)}</pre>
        </div>
    )
}

export default Task

/*
API URL:localhost:6565/todo/task
Method: GET
Access Type: Public
Req Fields: None
*/