import React, { Component } from 'react'

export default class Employee extends Component {

    constructor(props) {
        super(props);

        this.state = {
            employees: []
        }
    }

    componentDidMount() {

    }

    
  render() {
    return (
      <div>Employee</div>
    )
  }
}
