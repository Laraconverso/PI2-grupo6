'use client'
import altaDT from '@public/altaDT.jpeg'
import altaEquipo from '@public/altaEquipo.png'
import altaPartido from '@public/altaPartido.png'
import altaJugador from '@public/altaJugador.jpeg'
import Image from "next/image"
import { useState } from 'react'
import CreateUserForm from '../forms/CreateUserForm'
import CreateDT from '../forms/CreateDT'
import CreateMatch from '../forms/CreateMatch'
import CreateTeam from '../forms/CreateTeam'

type FormToShow = "createTeam" | "createMatch" | "createUser" | "createDT"

const ButtonViewForm = () => {
  const [formToShow, setFormToShow] = useState<FormToShow>("createUser")


  return (
    <div className='flex-col items-center justify-center'>
      <div className='grid grid-cols-2 gap-3 md:grid-cols-4 md:gap-6 md:p-6'>

        <section className='flex flex-col bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={() => setFormToShow("createTeam")}>
          <p className='text-center text-xl font-bauhs text-primary-500'>ALTA EQUIPO</p>
          <figure className='w-full max-h-24 overflow-hidden flex items-center justify-center'>
            <Image src={altaEquipo} className='object-cover object-bottom' alt="alta equipo" />
          </figure>
        </section>

        <section className='flex flex-col justify-around bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={() => setFormToShow("createDT")}>
          <p className='text-center text-xl font-bauhs text-primary-500'>ALTA DT</p>
          <figure className='w-full max-h-24 overflow-hidden flex items-center justify-center'>
            <Image src={altaDT} className='object-cover object-center' alt="alta equipo" />
          </figure>
        </section>

        <section className='flex flex-col justify-around bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={() => setFormToShow("createUser")}>
          <p className='text-center text-xl font-bauhs text-primary-500'>ALTA JUGADOR</p>
          <figure className='w-full max-h-24 overflow-hidden flex items-center justify-center'>
            <Image src={altaJugador} className='object-cover object-center' alt="alta equipo" />
          </figure>
        </section>

        <section className='flex flex-col justify-around bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={() => setFormToShow("createMatch")}>
          <p className='text-center text-xl font-bauhs text-primary-500'>ALTA PARTIDO</p>
          <figure className='w-full max-h-24 overflow-hidden flex items-center justify-center'>
            <Image src={altaPartido} className='object-cover object-center' alt="alta equipo" />
          </figure>
        </section>

      </div>
      <div >
        {(() => {
          switch (formToShow) {
            case "createUser":
              return <CreateUserForm />
            case "createDT":
              return <CreateDT />
            case "createMatch":
              return <CreateMatch />
            case "createTeam":
              return <CreateTeam />
          }
        })()}
      </div>
    </div>
  )
}
export default ButtonViewForm