'use client'
import { DevTool } from "@hookform/devtools"
import { yupResolver } from "@hookform/resolvers/yup"
import { useForm } from "react-hook-form"
import * as yup from "yup"

type Inputs = {
    name: string,
    lastName: string,
    dni: string,
    email: string,
    birthday: string,
    address: string,
    password: string
}
const schema: yup.ObjectSchema<Inputs> = yup.object({
    name: yup.string().required(),
    lastName: yup.string().required(),
    dni: yup.string().required(),
    email: yup.string().email().required(),
    birthday: yup.string().required(),
    address: yup.string().required(),
    password: yup.string().required()
})
const placeholders: Record<keyof Inputs, string> = {
    name: "Nombre *",
    lastName: "Apellido *",
    dni: "DNI *",
    email: "Correo electrónico *",
    birthday: "Fecha de nacimiento *",
    address: "Dirección *",
    password: "Contraseña *"
};
const CreateDT = () => {

    const { register, handleSubmit, control } = useForm<Inputs>({ resolver: yupResolver(schema) })

    return (
        <section className="w-screen bg-primary-400 flex flex-col gap-5 items-center text-baltic-sea-900 p-4">
            <h2 className="font-squada text-2xl md:text-4xl">Formulario alta <b>DT</b></h2>
            <form className="flex flex-col gap-4" action={()=>false}>
                <div className="grid md:grid-cols-2 gap-4">

                {Object.keys(schema.fields).map((fieldName, index) => (
                    <div key={index} className="bg-transparent">
                        <input {...register(fieldName as keyof Inputs)}
                            className="bg-transparent text-center md:text-left placeholder:text-baltic-sea-900 border-b-[1px] border-baltic-sea-900 outline-none"
                            placeholder={placeholders[fieldName as keyof Inputs]} />
                    </div>
                ))}
                </div>
                <button type="submit" className="text-primary-50 p-1 px-3 text-sm bg-baltic-sea-800 w-fit self-center rounded-2xl font-squada border-2 border-baltic-sea-900 drop-shadow-md active:scale-95">Alta Socio</button>
            </form>
            {/* <DevTool control={control} /> */}
        </section>
    )
}

export default CreateDT