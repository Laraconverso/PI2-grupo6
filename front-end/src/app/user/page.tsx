import footballUserBanner from "@public/bannerAdmin.png"
import Image from "next/image";

const page = () => {

  return (
    <main className="min-h-screen w-screen bg-primary-400 flex flex-col gap-5 items-center ">
        <figure className="w-full">
          <Image src={footballUserBanner} className="object-cover" alt={"Football banner"}/>
        </figure>
        <p className="text-baltic-sea-900">Proximamente</p>
      </main>
  );
}


export default page