import React, { Component } from 'react'
import axios from 'axios'
import TableRow from './TableRow';

export default class Product extends Component {

  constructor(props) {
    super(props);

    this.state = {
      products: []
    }
  }

  // life cycle method
  componentDidMount() {
    this.getProductList();
  }

  // Get Product List.
  getProductList = () => {
    let self = this;
    axios.get('http://localhost:9191/products').then(function(response) {
      // console.log(response.data);
      self.setState({
        products: response.data
      });
    })
  }

  render() {
    return (
      <div>
        {this.state.products.map(function(x, i) {
            return <TableRow key={i} data={x} />
        })}
      </div>
    )
  }
}
