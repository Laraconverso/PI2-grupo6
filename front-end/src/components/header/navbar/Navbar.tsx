'use client'

import { usePathname  } from "next/navigation"
import Unlogged from "./Unlogged"

const Navbar = () => {
const path = usePathname()

  return (
    <nav className="my-auto p-3">
      {
        (()=>{
          switch (path) {
            case "/":
              return <Unlogged/>
            case "/login":
              return <></>
            case "/user":
              return <div>user</div>
            case "/admin":
              return <div>admin</div>
            default:
              break;
          }
        })()
      }
    </nav>
  )
}

export default Navbar