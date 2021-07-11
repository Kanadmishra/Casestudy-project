import React, { Component } from "react";
import "./Home.css"

import UserService from "../services/user.service";

export default class Home extends Component {
  constructor(props) {
    super(props);

    this.state = {
      content: ""
    };
  }

  componentDidMount() {
    UserService.getPublicContent().then(
      response => {
        this.setState({
          content: response.data
        });
      },
      error => {
        this.setState({
          content:
            (error.response && error.response.data) ||
            error.message ||
            error.toString()
        });
      }
    );
  }

  render() {
    return (
    
      <div className="HomeBck">
        <center><h2 style={{backgroundColor: "white",
        fontSize:"50px",
        fontFamily: `'Lobster', cursive`,
        color:"purple"
        }}>Hospitality is simply an opprtunity to show love and care</h2></center>
        <div style={{
          display:"flex",
          flexDirection:"column",
          width:"100%"
        }}>
          <div style={{
            width:"100%",
            height:"1000px",
            background:`url('https://badianhotel.com/wp-content/uploads/2020/08/baglioni-hotel-london.jpg') no-repeat`,
          backgroundSize:"cover",
          
            }}></div>
           <div style={{
            width:"100%",
            height:"1000px",
            background:`url('https://badianhotel.com/wp-content/uploads/2020/08/the-spectator-charleston-south-carolina-lead-CHARLESTONHTLWB18-800x500.jpg') no-repeat`,
          backgroundSize:"cover",
       
          
          }}></div>
           <div style={{
            width:"100%",
            height:"1000px",
            background:`url('https://badianhotel.com/wp-content/uploads/2020/08/01-luxury-hotel-in-crete-creta-palace-6255-800x600.jpg') no-repeat`,
          backgroundSize:"cover",
          }}></div>
          
        </div>
      </div>
    );
  }
}
