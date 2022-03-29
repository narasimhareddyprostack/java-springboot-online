import { combineReducers } from "redux";
import { userReducer } from './user/user.reducer'
let rootReducer = combineReducers({ user: userReducer });


export { rootReducer }