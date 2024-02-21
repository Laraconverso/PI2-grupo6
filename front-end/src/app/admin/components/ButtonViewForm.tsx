'use client'
import altaDT from '@public/altaDT.jpeg'
import altaEquipo from '@public/altaEquipo.png'
import altaPartido from '@public/altaPartido.png'
import altaJugador from '@public/altaJugador.jpeg'
import Image from "next/image"
import { useState } from 'react'
import CreateUser from '../forms/CreateUserForm'
import CreateDT from '../forms/CreateDT'
import CreateMatch from '../forms/CreateMatch'
import CreateTeam from '../forms/CreateTeam'

const ButtonViewForm = () => {

  const [showCreateUserForm, setShowCreateUserForm] = useState(false); 
  const [showCreateDTForm, setShowCreateDTForm] = useState(false); 
  const [showCreateTeamForm, setShowCreateTeamForm] = useState(false); 
  const [showCreateMatchForm, setShowCreateMatchForm] = useState(false); 

  const handleCreateUserClick = () => {
    setShowCreateDTForm(false)
    setShowCreateTeamForm(false)
    setShowCreateMatchForm(false)
    setShowCreateUserForm(!showCreateUserForm); 
  };

  const handleCreateDTClick = () => {
    setShowCreateUserForm(false)
    setShowCreateTeamForm(false)
    setShowCreateMatchForm(false)
    setShowCreateDTForm(!showCreateDTForm); 
  };

  const handleCreateTeamClick = () => {
    setShowCreateUserForm(false)
    setShowCreateDTForm(false)
    setShowCreateMatchForm(false)
    setShowCreateTeamForm(!showCreateTeamForm); 
  };

  const handleCreateMatchesClick = () => {
    setShowCreateUserForm(false)
    setShowCreateDTForm(false)
    setShowCreateTeamForm(false); 
    setShowCreateMatchForm(!showCreateMatchForm)
  };
  return (
    <div className='flex flex-col items-center justify-center'>
    <div className='flex gap-8 max-h-80'>
      <section className='bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={handleCreateTeamClick}>
        <p className='text-center text-xl font-bauhs text-primary-500'>ALTA EQUIPO</p>
        <Image src={altaEquipo} width={200} height={150} alt="alta equipo"/>
      </section>
      <section className='bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={handleCreateDTClick}>
        <p className='text-center text-xl font-bauhs text-primary-500'>ALTA DT</p>
        <Image src={altaDT} width={200} height={150} alt="alta equipo"/>
      </section>
      <section className='bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={handleCreateUserClick}>
        <p className='text-center text-xl font-bauhs text-primary-500'>ALTA JUGADOR</p>
        <Image src={altaJugador} width={150} height={150} alt="alta equipo"/>
      </section>
      <section className='bg-silver-950 px-4 py-5 rounded-3xl cursor-pointer' onClick={handleCreateMatchesClick}>
        <p className='text-center text-xl font-bauhs text-primary-500'>ALTA PARTIDO</p>
        <Image src={altaPartido} width={200} height={150} alt="alta equipo"/>
      </section>
    </div>
    <div >
      {showCreateUserForm && <CreateUser />}
      {showCreateDTForm && <CreateDT />}
      {showCreateTeamForm && <CreateTeam />}
      {showCreateMatchForm && <CreateMatch/>}
    </div>
  </div>
  )
}
export default ButtonViewForm