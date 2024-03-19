import React, { useEffect, useState } from 'react'
import { Link, useLocation } from 'react-router-dom'

export default function Navbar() {

  const location = useLocation();
  return (
    <>
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary shadow">
     <div className="container-fluid">
      <Link className="navbar-brand" to="/">Employee Management</Link>
    { location.pathname == '/' ? <Link className='btn btn-outline-light' to="/homeuser">View User</Link>:        <Link className='btn btn-outline-light' to="/adduser">Add User</Link>
}
  </div>
</nav>
    </>
  )
}


  
