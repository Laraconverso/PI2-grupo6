import Image from "next/image"
import logo from "@public/LogoBlanco.png"
import Unlogged from "./navbar/Unlogged"
import Logged from "./navbar/Logged"
import Admin from "./navbar/Admin"
import { cookies } from "next/headers"
import { unstable_noStore } from "next/cache"
import Navbar from "./navbar/Navbar"
import Link from "next/link"


const Header = () => {

  let navbarState = cookies().get("navbarState")?.value as "admin" | "logged" | "unlogged" | "none"

  return (
    <header className="w-screen top-0 z-10 fixed">
      <div className={`flex flex-row justify-between bg-silver-950 bg-opacity-70`}>
        <figure className="text-white p-3 cursor-pointer">
          <Link href={'/'}>
            <Image src={logo} alt="Club App logo" height={60} />
          </Link>
        </figure>

        <Navbar />
      </div>
    </header>
  )
}

// const IsLoggedNavbar = () => {

//   const [isOpen, setIsOpen] = useState(false)

//   const toggleNavbar = () => {
//     setIsOpen(!isOpen);
//   };

//   const selectOption = (option: "Login" | "signUp") => {
//     setIsOpen(false)
//   }

//   return (
//     <div className="relative md:hidden">

//       <button
//         data-collapse-toggle="navbar-default"
//         type="button"
//         className="inline-flex items-center p-2 w-10 h-10 justify-center text-sm text-primary-200 rounded-lg hover:bg-primary-700 focus:outline-none focus:bg-primary-700 transition"
//         aria-controls="navbar-default"
//         aria-expanded={isOpen ? "true" : "false"}
//         onClick={toggleNavbar}
//       >
//         <span className="sr-only">Abrir menu principal</span>
//         <svg
//           className="w-5 h-5"
//           aria-hidden="true"
//           xmlns="http://www.w3.org/2000/svg"
//           fill="none"
//           viewBox="0 0 17 14"
//         >
//           <path
//             stroke="currentColor"
//             strokeLinecap="round"
//             strokeLinejoin="round"
//             strokeWidth="2"
//             d="M1 1h15M1 7h15M1 13h15"
//           />
//         </svg>
//       </button>

//       <div
//         className={`${isOpen ? 'flex' : 'hidden'
//           } absolute right-0 transition ease-out duration-75`}
//         id="navbar-default"
//       >
//         <ul className="font-medium flex flex-col gap-4 p-4 mt-4 border border-gray-500 rounded-s-lg bg-primary-950 rtl:space-x-reverse">
//           <li className=""><button onClick={() => selectOption("Login")}>Iniciar sesión</button></li>
//           <li><button onClick={() => selectOption("signUp")}>Registrarse</button></li>
//         </ul>
//       </div>
//     </div >
//   )
// }
// const userNotFound = () => {
// }
export default Header