import { cookies } from "next/headers"
import CreateUser from "./forms/CreateUser"
import LoginAdmin from "./forms/LoginAdmin"

const page = async() => {
 const adminAuth = cookies().has("adminAuth");

  return (
    <main className="min-h-screen">
      {adminAuth ? <CreateUser/> : <LoginAdmin/>}
    </main>
  )
}

export default page