'use client'

import { Dispatch, SetStateAction, useState } from "react"
import SignUp from "./SignUp"
import LogIn from "./LogIn"
import Image from "next/image"
import logo from"@public/LogoBlanco.png"

const Header = () => {

  const [modalState, setModalState] = useState<"logIn" | "signUp" | "none">("none")

  return (
    <header className="w-screen top-0  z-10 ">
      {
        (() => {
          switch (modalState) {
            case "logIn":
              return <LogIn setModal={setModalState} />
            case "signUp":
              return <SignUp setModal={setModalState} />
            default:
              <></>
              break;
          }
        })()
      }
      <div className={`flex flex-row justify-between bg-silver-950 bg-opacity-60`}>
      <figure className="text-white p-3">
        <Image src={logo} alt="Club App logo" height={60}/> 
      </figure>

      <nav className="w-fit text-xs flex items-center">
        <MobileNavbar setModal={setModalState} />
        <div className="hidden md:flex gap-4 pr-3">

          <button className="px-5 bg-primary-500 h-fit rounded-3xl py-3 font-semibold text-silver-950 shadow-xl" onClick={()=>setModalState("logIn")}>Iniciar sesion</button>
          <button onClick={()=>setModalState("signUp")}>REGISTRARSE</button>
        </div>
      </nav>
      </div>
    </header>
  )
}

const MobileNavbar = ({ setModal }: { setModal: Dispatch<SetStateAction<"logIn" | "signUp" | "none">> }) => {

  const [isOpen, setIsOpen] = useState(false)

  const toggleNavbar = () => {
    setIsOpen(!isOpen);
  };

  const selectOption = (option: "logIn" | "signUp") => {
    setIsOpen(false)
    setModal(option)
  }

  return (
    <div className="relative md:hidden">

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
        <ul className="font-medium flex flex-col gap-4 p-4 mt-4 border border-gray-500 rounded-s-lg bg-primary-950 rtl:space-x-reverse">
          <li className=""><button onClick={() => selectOption("logIn")}>Iniciar sesion</button></li>
          <li><button onClick={() => selectOption("signUp")}>Registrarse</button></li>
        </ul>
      </div>
    </div >
  )
}

export default Header