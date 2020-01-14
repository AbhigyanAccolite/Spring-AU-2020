
import {search} from "../actions/index.js";

class App extends React.Component{
/*
*  your code
*
*/
}

const mapStateToProps = (state) => ({
   jsonData: state.jsonData
});

const mapDispatchToProps = (dispatch) => {
   return {
      search: event => dispatch(search(event.target.value))
   }
}


export default connect(mapStateToProps, mapDispatchToProps)(App)