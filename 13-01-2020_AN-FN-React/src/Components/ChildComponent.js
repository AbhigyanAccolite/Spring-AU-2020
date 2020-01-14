import React, { Component } from 'react';
import './ChildComponent.css';
// import jsonData from '../Data/pollution.json';

class ChildComponent extends Component {  
    constructor() {
        super();
        this.state = {
            PollutionInfo: [],
            filteredData: []
        };
        // this.filterData=this.filterData.bind(this);
    }

    componentDidMount() {
        fetch('pollution.json')
        .then(data => data.json())
        .then((data) => {
            this.setState({PollutionInfo: data});
            console.log(this.state.PollutionInfo);
        });
    }

    filterData = () => {      

        const pattern = new RegExp(event.target.value);
        console.log(pattern);        
        const data = this.state.PollutionInfo.filter(item => pattern.test(item.state));
        
        this.setState({filteredData: data});
        console.log(this.state.filteredData);
        localStorage.setItem('filteredData', JSON.stringify(this.state.filteredData));
        localStorage.setItem('pattern', event.target.value);
        
    }

    render() {
        const data = localStorage.filteredData ? JSON.parse(localStorage.filteredData) : this.state.filteredData;
        console.log(data);
        const filteredData = data.map((item) => (<li key={item.id}> {item.pollutant_id}</li>));        
    
    return (
      <div>
        <div>
            <input type="text" name="state" onChange={this.filterData} 
                value={localStorage.pattern ? localStorage.pattern : ' '} placeholder="Search By States" />
        </div>
        <div>
            <ul>
                {filteredData}
            </ul>      
        </div>
      </div>
    );
  }
}

export default ChildComponent;
