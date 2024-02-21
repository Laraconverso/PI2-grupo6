'use client'

import { usePathname  } from "next/navigation"
import Unlogged from "./Unlogged"
import Link from "next/link"
import Logged from "./Logged"

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
              return <Logged/>
            case "/admin":
              return (
                <div>
                  <section className="flex gap-8">
                    <button>Perfil</button>
                    <button>Cobros</button>
                    <Link href={'/'}>
                      <button className="group bg-primary-500 font-squada rounded-3xl p-1 px-2 drop-shadow-sm text-baltic-sea-900">
                        <p className="drop-shadow-md group-active:scale-95">Cerrar Sesion</p>
                      </button>
                    </Link>
                  </section>
                  
                </div>
              )
            default:
              break;
          }
        })()
      }
    </nav>
  )
}

export default Navbar