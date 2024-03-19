import './App.css';
import Navbar from './components/Navbar';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import Home from './Pages/Home';
import {BrowserRouter as Router,Routes,Route} from "react-router-dom"
import AddUser from './users/AddUser';
import EditUser from './users/EditUser';
import ViewUser from './users/ViewUser';
import Main from './Pages/Main';
function App() {
  return (

    <>
  <div className='App'>
      <Navbar/>
      <Routes>
        <Route exact path='/' element={<Main/>}/>
        <Route exact path='/homeuser' element={<Home/>}/>
        <Route exact path='/adduser' element={<AddUser/>}/>
        <Route exact path="/edituser/:id" element={<EditUser/>}/>
        <Route exact path="/viewuser/:id" element={<ViewUser/>}/>
      </Routes>

  </div>
  </>
  );
}

export default App;
