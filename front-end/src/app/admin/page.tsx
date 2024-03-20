import { cookies } from "next/headers"
import LoginAdmin from "./forms/LoginAdmin"
import ButtonViewForm from "./components/ButtonViewForm"



const page = async() => {

  const adminAuth = cookies().has("adminAuth");

  return (
    <div className="w-screen">
  {
    adminAuth ? <LoginAdmin/> 
    : 
    <main className="text- center mt-20 bg-baltic-sea-100 text-baltic-sea-950">
       {/* <figure className="w-full">
          <Image src={footballAdminBanner} className="object-cover" alt={"Football banner"}/>
        </figure> */}
      <h1 className="text-center text-5xl font-bauhs"> Bienvenido</h1>
      <ButtonViewForm/>
    </main>
  }
  </div>
  )
}


export default page