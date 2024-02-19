import FixtureContainer from "@/components/fixture/FixtureContainer";
import TeamContainer from "@/components/teams/TeamContainer";
import Image from "next/image";
import footballBanner from "@public/bannerFootball.png"

export default function Home() {
  
  return (
    <main className="flex flex-col bg-gradient-to-b  from-primary-600 to-primary-400 min-h-screen">
      <figure className="w-full">
        <Image src={footballBanner} className="object-cover" alt={"Football banner"}/>
      </figure>

      <div className={`mt-40`}>
        <h1 className="text-center text-5xl font-bauhs"> Bienvenido a ClubAPP</h1>
      </div>
      <div className={`flex justify-evenly shadow-2xl mx-16 mt-16 pb-6 px-6`}>
        <FixtureContainer />
        <TeamContainer />
      </div>
    </main>
  );
}
