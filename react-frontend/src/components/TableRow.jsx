import React, { Component } from 'react'
import { Button } from 'react-bootstrap'
import './css/TableRow.css'
// import TableActionButtons from './TableActionButtons';

export default class TableRow extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <>
                <tr>
                    <th scope="row" style={{padding: '10px'}}>{this.props.data.id}</th>
                    <td style={{padding: '10px'}}>{this.props.data.name}</td>
                    <td style={{padding: '10px'}}>{this.props.data.quantity}</td>
                    <td style={{padding: '10px'}}>{this.props.data.price}</td>
                    <td style={{padding: '10px'}}>{this.props.data.position}</td>
                    <td style={{padding: '10px'}}>{this.props.data.salary}</td>
                    <td style={{padding: '10px'}}>
                        <Button variant="primary">Primary</Button>{' '}
                        {/* <TableActionButtons eachRowId={this.props.data.id} /> */}
                    </td>   
                </tr>
            </>
        )
    }
}