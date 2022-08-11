// import React, { Component } from 'react'
// import ViewModal from '../modals/ViewModal'
// import UpdateModal from '../modals/UpdateModal';
// import DeleteModal from '../modals/DeleteModal';

// export default class TableActionButtons extends Component {

//   constructor(props) {
//     super(props);

//     this.state = {
//       currentEmployeeName: null,
//       currentEmployeeSalary: null
//     }
//   }

//   // Getting Individual employee data.

//   getEmployeeDetails = (id) => {
//     axios.post('/get/individual/employee/details', {
//       employeeId: id
//     }).then((response) => {
//       this.setState({
//         currentEmployeeName: response.data.employee_name,
//         currentEmployeeSalary: response.data.salary
//       })
//       console.log(response.data);
//     })
//   } 

//   render() {
//     return (
//       <div className="btn-group" role="group">
//         <button 
//           className="btn btn-primary" 
//           type="button"
//           data-bs-toggle="modal" 
//           data-bs-target={"#viewModal" + this.props.eachRowId}
//           onClick={ () => {this.getEmployeeDetails(this.props.eachRowId)} }
//         >
//           View
//         </button>
//         <ViewModal modalId={ this.props.eachRowId } employeeData={ this.state }/>

//         <button 
//           className="btn btn-info" 
//           type="button"
//           data-bs-toggle="modal" 
//           data-bs-target={"#updateModal" + this.props.eachRowId}
//           onClick={ () => {this.getEmployeeDetails(this.props.eachRowId)} }
//         >
//           Update
//         </button>
//         <UpdateModal modalId={ this.props.eachRowId } employeeData={ this.state }/>

//         <button 
//           className="btn btn-danger" 
//           type="button"
//           data-bs-toggle="modal" 
//           data-bs-target={"#deleteModal" + this.props.eachRowId}
//           onClick={ () => {this.getEmployeeDetails(this.props.eachRowId)} }
//         >
//           Delete
//         </button>
//         <DeleteModal modalId={ this.props.eachRowId } employeeData={ this.state }/>

//       </div>
//     )
//   }
// }