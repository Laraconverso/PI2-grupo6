'use server'

export async function createUserAction(formData: FormData) {

    const getValue = (value: string) => {
        return formData.get(value)?.toString()
    }

    const body = {
        userName: getValue("name"),
        userLastname: getValue("lastName"),
        userDni: getValue("dni"),
        userEmail:getValue("email") ,
        userAddress: getValue("address"),
        userPassword: getValue("dni"),
        playerBirthdate: getValue("birthday")
    }

    try {
        const data = await fetch('http://localhost:8080/players/save' , {  
            method: "POST",
            headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify(body)
        })
        return data.json()
    } catch (error: any) {
        throw new Error(error)
    }
    
}