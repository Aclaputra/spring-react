import axios from 'axios';
import React, { Component } from 'react'
import TableRow from './TableRow';

export default class Employee extends Component {

    constructor(props) {
        super(props);

        this.state = {
            employees: []
        }
    }

    componentDidMount() {
      this.getEmployeeList();
    }

    getEmployeeList = () => {
      let self = this;
      axios.get('http://localhost:9191/employees').then(function(response) {
        self.setState({
          employees: response.data
        });
      })
    }

    
  render() {
    return (
      <div>
        {this.state.employees.map(function(x, i) {
            return <TableRow key={i} data={x} />
        })}
      </div>
      )
    }
}
