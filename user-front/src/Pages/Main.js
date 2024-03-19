import React from 'react'
import img1 from '../assets/front.jpg'

function Main() {
  return (
    <>
    <div id="carouselExampleSlidesOnly" className="carousel slide mt-3" data-bs-ride="carousel">
  <div className="carousel-inner">
    <div className="carousel-item active">
      <img src={img1} className="d-block w-100 " alt="..."/>
    </div>
    <div className="carousel-item">
      <img src="https://source.unsplash.com/random" className="d-block w-100" alt="..."/>
    </div>
    <div className="carousel-item">
      <img src="https://source.unsplash.com/random" className="d-block w-100" alt="..."/>
    </div>
  </div>
</div>
    </>
  )
}

export default Main