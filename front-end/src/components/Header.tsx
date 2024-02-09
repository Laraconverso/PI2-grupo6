'use client'

import { useEffect, useState } from "react"

const Header = () => {
  return (
    <div className="w-screen flex flex-row justify-between z-10">
      <figure className="text-white">
        {/* <Image src={icon} alt="Club App logo" /> */}
      </figure>

      <nav className="w-fit text-xs">
      <MobileNavbar />
      <div className="hidden md:fixed">

        <button>INGRESAR</button>
        <button>REGISTRARSE</button>
      </div>
      </nav>
    </div>
  )
}

const MobileNavbar = () => {
  const [isOpen, setIsOpen] = useState(false)
  const toggleNavbar = () => {
    setIsOpen(!isOpen);
  };

useEffect(() => {
  console.log(isOpen
  );
  
}, [isOpen])


  return (
    <div className="relative">

      <button
        data-collapse-toggle="navbar-default"
        type="button"
        className="inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-primary-200 rounded-lg  hover:bg-primary-700 focus:outline-none  focus:bg-primary-700 transition"
        aria-controls="navbar-default"
        aria-expanded={isOpen ? "true" : "false"}
        onClick={toggleNavbar}
      >
        <span className="sr-only">Abrir menu principal</span>
        <svg
          className="w-5 h-5"
          aria-hidden="true"
          xmlns="http://www.w3.org/2000/svg"
          fill="none"
          viewBox="0 0 17 14"
        >
          <path
            stroke="currentColor"
            strokeLinecap="round"
            strokeLinejoin="round"
            strokeWidth="2"
            d="M1 1h15M1 7h15M1 13h15"
          />
        </svg>
      </button>

      <div
        className={`${isOpen ? 'flex' : 'hidden'
          } absolute right-0 transition ease-out duration-75`}
        id="navbar-default"
      >
        <ul className="font-medium flex flex-col gap-4 p-4 md:p-0 mt-4 border border-gray-500 rounded-s-lg bg-primary-950 rtl:space-x-reverse">
          <li><button>Ingresar</button></li>
          <li><button>Registrarse</button></li>
        </ul>
      </div>
    </div >
)
}

export default Header