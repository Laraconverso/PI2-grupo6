'use server'

import { cookies } from "next/headers"

const users = [
    {
        name: "admin",
        email: "admin@gmail.com",
        password: "12345",
        role: "admin",
        dni: "12345"
    },
    {
        name: "user",
        email: "user@gmail.com",
        role: "user",
        password: "12345",
        dni: "1234"
    }
]

export async function authDNI(formData: FormData) {
    const dni = formData.get("dni")?.toString()  ;
    if (!dni) return false; 
    const validDNI = validateDNI(dni)
    if (!validDNI) return false;

    const expires = new Date(Date.now() + 50 * 1000);
    cookies().set("dni", dni, {expires , httpOnly: true})
    // cookies().set("navbarState", "none", {httpOnly: true})
    return true
}

const validateDNI = (dni: string) => {
    return users.some(user => user.dni === dni)
}

export async function authUser(formData:FormData) {
    const dni = cookies().get("dni")?.value  ;
    const email = formData.get("email")?.toString();
    const password = formData.get("password")?.toString();

    const user = users.find(user => user.dni === dni)
    
    if (!user) return false;
    cookies().set("userAuth", "true")
    return user.email === email && user.password === password ? true : false;
}

export async function adminAuth (password?: string ){
    const validPassword = password === process.env.ADMIN_PASSWORD ? true : false;
    if (!validPassword) return false
    cookies().set("adminAuth", "true" ,{ maxAge: 5 })
    return true
}