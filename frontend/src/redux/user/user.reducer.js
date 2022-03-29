import { REG_SUCCESS, REG_FAILURE } from './user.action'
let initialState = {}
let userReducer = (state = initialState, action) => {
    console.log(action);
    switch (action.tye) {
        case REG_SUCCESS:
            return
        case REG_FAILURE:
            return
        default:
            return state
    }
}

export { userReducer }

//what is reducer?
//Reducer is pure function?
//