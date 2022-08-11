import React, { Component } from 'react'
// import TableActionButtons from './TableActionButtons';

export default class TableRow extends Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <>
                <tr>
                    <th scope="row">{this.props.data.id}</th>
                    <td>{this.props.data.name}</td>
                    <td>{this.props.data.quantity}</td>
                    <td>{this.props.data.price}</td>
                    <td>
                        {/* <TableActionButtons eachRowId={this.props.data.id} /> */}
                    </td>   
                </tr>
            </>
        )
    }
}