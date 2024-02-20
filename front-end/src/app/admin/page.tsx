import { cookies } from "next/headers"
import CreateUser from "./forms/CreateUser"
import LoginAdmin from "./forms/LoginAdmin"
import footballAdminBanner from "@public/bannerAdmin.png"
import Image from "next/image"
import ButtonViewForm from "./components/ButtonViewForm"
import { useState } from "react"
import CreateDT from "./forms/CreateDT"



const page = () => {

  const adminAuth = cookies().has("adminAuth");

  return (
    <main className="min-h-screen">
      {adminAuth ? (
        <figure className="min-h-screen w-screen">
          <Image src={footballAdminBanner} className="object-cover" alt={"Football banner"}/>
        </figure>
      ): (undefined)}
      {adminAuth ? (
        <main className="w-screen bg-primary-400 flex flex-col gap-5 items-center p-4 min-h-screen">
          <div className={`mt-10`}>
            <h1 className="text-center text-5xl font-bauhs"> Bienvenido a ClubAPP</h1>
          </div>
          <div className="justify-center">
            <ButtonViewForm/>
          </div>
        </main>
      ) :( <LoginAdmin/>)}
    </main>
  );
}


export default page