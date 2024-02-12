import { useForm } from "react-hook-form"
import { yupResolver } from "@hookform/resolvers/yup";
import * as yup from 'yup';
import { Dispatch, SetStateAction } from "react";

type Inputs = {
  dni: number,
}

const schema: yup.ObjectSchema<Inputs> = yup.object({
  dni: yup.number().required(),
})


const SignUp = ({ setModal }: { setModal: Dispatch<SetStateAction<"logIn" | "signUp" | "none">> }) => {
  const { control, register, formState: { errors } } = useForm<Inputs>({ resolver: yupResolver(schema) })
  const closeModal = () => {
    setModal("none")
  }

  return (

    <div className="fixed inset-0 w-screen h-screen flex text-primary-500 justify-center">
    <div className="fixed inset-0 w-screen h-screen bg-black bg-opacity-20  backdrop-filter backdrop-blur-sm" onClick={closeModal} />

    <div className="relative flex flex-col bg-silver-50 bg-opacity-80 rounded-2xl text-center gap-7 z-10 my-auto py-4">
    <button className="font-semibold absolute top-3 right-5 cursor-pointer z-10" onClick={closeModal}>x</button>
      <p className="text-xl font-bauhs drop-shadow-md">Ingresa tu DNI</p>
      <form action="" className="flex flex-col gap-4 w-screen sm:w-fit sm:p-4">
        <div className="py-2 px-4 bg-silver-50 rounded-2xl flex flex-col text-left text-silver-950 shadow-md">
          {/* <label htmlFor="dni" className="font-semibold ">DNI</label> */}
          <input type="text" {...register("dni")} className="bg-primary-200 p-1 focus-visible:outline-primary-700 focus-visible:bg-primary-100 rounded-md font-semibold text-center "
          placeholder="DNI" />
        </div>
      </form>
      <button className="bg-silver-950 font-bold text-sm -600 w-fit py-1 px-4 m-auto rounded-3xl hover:scale-105 transition drop-shadow-md">INGRESAR</button>
    </div>
  </div>


  )
}

export default SignUp