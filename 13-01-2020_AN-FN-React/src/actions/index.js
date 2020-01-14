import { SEARCH } from "./action-types";


export function search(payload) {
    return { type: SEARCH, payload }
};


const PollutionSuccess = pollution => ({
    type: 'POLLUTION_SUCCESS',
    payload: { pollution }
});

const fetchPollutionFailure = error => ({
    type: 'POLLUTION_FAILURE',
    payload: { error }
});

export const setData = filter => ({
    type: 'SET_DATA',
    payload: { filter }
});