import * as React from 'react';
import Card from '@mui/material/Card';
import { CardContent } from '@mui/material';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import MoreHorizIcon from '@mui/icons-material/MoreHoriz';
import "./App.css";

const card=(<React.Fragment>
  <CardContent>
    <img className="image" src="https://images-na.ssl-images-amazon.com/images/I/911-oWq+psL.jpg" height="250px" width="200px" alt="Book"></img>
    <h4 className="book-name">Beyond Entreprenurship</h4>
    <h5 className="author">Jim Collins & Bill Lazier</h5>
    <AccessTimeIcon fontSize="medium"></AccessTimeIcon>
    <span className='time-read'>13-minute read</span><br></br>
    <MoreHorizIcon fontSize="medium" className="icon"></MoreHorizIcon>
  </CardContent>
</React.Fragment>)
export default function App() {
  return <div className='app'>
    <Card variant="outlined" className='card'>{card}</Card>
  </div>
}