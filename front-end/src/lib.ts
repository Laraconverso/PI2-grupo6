// import { cookies } from "next/headers";
// import { NextRequest, NextResponse } from "next/server";

// export async function Login(formData: FormData) {
//     // Verify credentials && get the user
  
//     const user = { email: formData.get("email"), name: "John" };
  
//     // Create the session
//     const expires = new Date(Date.now() + 10 * 1000);
//     const session = await encrypt({ user, expires });
  
//     // Save the session in a cookie
//     cookies().set("session", session, { expires, httpOnly: true });
//   }

// export async function updateSession(request: NextRequest) {
//     const session = request.cookies.get("session")?.value;
//     if (!session) return;
  
//     // Refresh the session so it doesn't expire
//     const parsed = await decrypt(session);
//     parsed.expires = new Date(Date.now() + 10 * 1000);
//     const res = NextResponse.next();
//     res.cookies.set({
//       name: "session",
//       value: await encrypt(parsed),
//       httpOnly: true,
//       expires: parsed.expires,
//     });
//     return res;
//   }
  